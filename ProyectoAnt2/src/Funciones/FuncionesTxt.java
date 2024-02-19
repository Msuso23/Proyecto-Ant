package Funciones;

import EDD.Arista;
import EDD.Lista;
import EDD.Nodo;
import EDD.Vertice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FuncionesTxt {

    Lista vertices = new Lista();
    
    public int loadFile(){
    //0: CÓDIGO EXITOSO
    //1: SALIDA ERRÓNEA

        //1. Cargar JFileChooser
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("IMPORTA TU TXT");
        
        //2. Crear filtros
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT", "txt");
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(filter);
        
        //3. Respuesta
        int select = fc.showOpenDialog(null);
        
        //4. Selección correcta
        if (select == JFileChooser.APPROVE_OPTION) {

            try {
            //4.1 Obtener path del archivo
            String pathFile = fc.getSelectedFile().getAbsolutePath();
          
            //4.2 Obtener archivo
            File file = new File(pathFile);
            
            //4.3 Aplicar scanner
            Scanner scanner = new Scanner(file);
            
            //4.4 Leer archivo
            if (scanner.hasNextLine() == false){
                return 1;
                }
            else{
                //4.4.1 Lectura
                boolean city = false;
                boolean edge = false;
                
                while (scanner.hasNextLine())    
                {
                    String line = scanner.nextLine().trim().toLowerCase();
                    
                    //Filtraje
                    if ("ciudad".equals(line)) {
                        city = true;
                        edge = false;
                    }
                    if ("aristas".equals(line)) {
                        edge = true;
                        city = false;    
                    }
                    
                    //Filtrar ciudad
                    if (!"ciudad".equals(line) && city == true && !"".equals(line)) {
                        //TryCatch para evaluar que las ciudades sean un entero
                        try{
                            int entero = Integer.parseInt(line);                         
                            Vertice v = new Vertice(entero, new Lista());
                            vertices.insertarFinal(v);
                        }
                        catch (NumberFormatException ex){
                            Messages.error("La ciudad \" " + line + "\" no se agregó, no es un entero.");
                            }
                        }
                    //Filtrar aristas
                    if (!"aristas".equals(line) && edge == true && !"".equals(line)) {
                        String regex = "\\d+,\\d+,[\\d.]+";
                        Pattern pattern = Pattern.compile(regex);
                        Matcher matcher = pattern.matcher(line);
                        if(matcher.matches()){
                            String[] aSplit = line.split(",");
                            Vertice a = new Vertice(Integer.parseInt(aSplit[0]), null);
                            Vertice b = new Vertice(Integer.parseInt(aSplit[0]), null);
                            Arista ars = new Arista(a,b, Double.parseDouble(aSplit[2]));
                            //Coordinar vertices con sus aristas (Lista_ady)
                            for (int i = 0; i < vertices.getSize(); i++) {
                            Vertice aux = (Vertice) vertices.getValor(i);
                         
                            if (aux.getNumeroCiudad() == a.getNumeroCiudad()){
                                aux.getList_ady().insertarFinal(ars);
                                
                                }
                            else if (aux.getNumeroCiudad() == b.getNumeroCiudad()){
                                aux.getList_ady().insertarFinal(ars);
    
                            }  
                            }

                    } else{
                        Messages.error("La arista \" " + line + "\" no se agregó, no cumple con el formato requerido. (entero,entero,double)");}
                  
                }
                }
            
            return 0;
            
            }  
            } catch (FileNotFoundException ex){
                Messages.error("Hubo una complicación leyendo el archivo (scanner)");
                return 1;
            } 
        }else{
            Messages.error("No se seleccionó ningún archivo");
            return 1;
        }
    
    }
    
    public Lista getVertices() {
        return vertices;
    }
    
    public void saveFile(){
        System.out.println("Guardando archivo...");}
    
}