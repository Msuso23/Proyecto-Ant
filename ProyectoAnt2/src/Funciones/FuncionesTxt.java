package Funciones;

import EDD.Arista;
import EDD.Lista;
import EDD.Nodo;
import EDD.Vertice;

import Interfaces.InterfaceFunctions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FuncionesTxt {

    Lista vertices = new Lista();
    
    public int loadFile(){

        
        vertices = new Lista(); //Vaciar en caso de cargar un segundo txt

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

                            Vertice b = new Vertice(Integer.parseInt(aSplit[1]), null);
                            Nodo n1 = vertices.getpFirst();
                            while (n1 != null){
                                Vertice v1 = (Vertice) n1.getDato();
                                if(a.getNumeroCiudad() == v1.getNumeroCiudad()){
                                    a = v1;
                                }         
                                n1 = n1.getPnext();            
                            }
                            Nodo n2 = vertices.getpFirst();
                            while (n2 != null){
                                Vertice v2 = (Vertice) n2.getDato();
                                if(b.getNumeroCiudad() == v2.getNumeroCiudad()){
                                    b = v2;
                                }         
                                n2 = n2.getPnext();            
                            }

                            Arista ars = new Arista(a,b, Double.parseDouble(aSplit[2]));
                 

                            //Coordinar vertices con sus aristas (Lista_ady)
                            for (int i = 0; i < vertices.getSize(); i++) {
                            Vertice aux = (Vertice) vertices.getValor(i);
                         
                            if (aux.getNumeroCiudad() == a.getNumeroCiudad()){

                                a.getList_ady().insertarFinal(ars);
                                
                                }
                            else if (aux.getNumeroCiudad() == b.getNumeroCiudad()){
                                b.getList_ady().insertarFinal(ars);

    
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
    

    public void saveFile() {
    Lista ciudad = new Lista();
    ciudad.insertarFinal("ciudad");

    Lista aristas = new Lista();
    aristas.insertarFinal("aristas");

    Lista datos = InterfaceFunctions.getGrafo().getListaCiudades();
    Nodo aux = datos.getpFirst();

    // Recorrer los datos y agregarlos a las listas
    while (aux != null) {
        Vertice v = (Vertice) aux.getDato();
        ciudad.insertarFinal(String.valueOf(v.getNumeroCiudad()));
        
        if (!v.getList_ady().isEmpty()){
            Nodo pointer = v.getList_ady().getpFirst();
            while (pointer != null) {
                
                Arista a = (Arista) pointer.getDato();
                if (v.getNumeroCiudad() == a.getCiudadInicio().getNumeroCiudad()){
                String chain = a.getCiudadInicio().getNumeroCiudad() + "," + a.getCiudadDestino().getNumeroCiudad() + "," + a.getDistancia();
                aristas.insertarFinal(chain);
                }
                pointer = pointer.getPnext();
            }
        }
        aux = aux.getPnext();
            
        
        
        }


    // Crear la lista que contendrá las líneas a escribir en el archivo
    Lista lines = new Lista();

    // Agregar los nodos de ciudad a la lista 'lines'
    Nodo auxCiudad = ciudad.getpFirst();
    while (auxCiudad != null) {
        lines.insertarFinal(auxCiudad.getDato());
        auxCiudad = auxCiudad.getPnext();
    }

    // Agregar los nodos de aristas a la lista 'lines'
    Nodo auxAristas = aristas.getpFirst();
    while (auxAristas != null) {
        lines.insertarFinal(auxAristas.getDato());
        auxAristas = auxAristas.getPnext();
    }
    

    // Crear un JFileChooser
    JFileChooser fileChooser = new JFileChooser();

    // Mostrar el cuadro de diálogo para guardar archivo
    int option = fileChooser.showSaveDialog(null);

    // Verificar si el usuario ha seleccionado una ruta para guardar el archivo
    if (option == JFileChooser.APPROVE_OPTION) {
        // Obtener el archivo seleccionado
        File selectedFile = fileChooser.getSelectedFile();

        // Obtener el absolutePath del archivo seleccionado
        String absolutePath = selectedFile.getAbsolutePath();

        // Escribir en el archivo
        try (FileWriter writer = new FileWriter(absolutePath)) {
            // Iterar sobre la lista 'lines' y escribir cada línea en el archivo
            Nodo linesNode = lines.getpFirst();
            while (linesNode != null) {
                String line = (String) linesNode.getDato();
                writer.write(line + "\n");
                linesNode = linesNode.getPnext();
            }
            Messages.information("Se han guardado los cambios!");
        } catch (IOException e) {
            Messages.error("ERROR! Ocurrió un error inesperado");
        }
    }
}
}

