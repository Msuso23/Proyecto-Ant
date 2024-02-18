
package EDD;

import Clases.Ant;

/**
 *
 * @author nicolepinto
 * @author Camila Garcia
 */
public class Grafo {
    private MatrizAdyacente matrizady;
    private Lista ciudades;
    private int size;
    
    
    //Constructor
    public Grafo(MatrizAdyacente matrizady) {
        this.matrizady = matrizady;
        this.ciudades = null;
        this.size = 0;
    }
    
    public Grafo(){
    }
        
    
    //Getters y Setters

    public MatrizAdyacente getMatrizady() {
        return matrizady;
    }

    public void setMatrizady(MatrizAdyacente matrizady) {
        this.matrizady = matrizady;
    }

    public Lista getCiudades() {
        return ciudades;
    }

    public void setCiudades(Lista ciudades) {
        this.ciudades = ciudades;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    //Este metodo crea una nueva Ciudad
    public void crearCiudad(Object num){
        Ciudades ciudad= new Ciudades(num,null);
        if(ciudades.isEmpty()){
            ciudades.agregarInicio(ciudad);
        }else{
            ciudades.InsertarFinal(ciudad);
        }
        size++;
    }
    
    //Metodo para crear nueva hormiga
    public Ant hormiga(Object name){
        Ant hormiga= new Ant (name);
        return hormiga;
    }
    
    //Metodo que retorna el primer nodo del grafo
    public Nodo getFirstNodo(){
        return getCiudades().getpFirst();
    }
    
    //Metodo que retorna el numero de Ciudades
    public int getCiudadesNumero(){
        int num=0;
        for (int i = 0; i < ciudades.getSize(); i++) {
             num++;
        }
        return num;
    }
    
    //Metodo que retorna un string array con el nombre de todas las ciudades
    public String[] nombreEnString(){
        String [] cadena;
        cadena= new String[size];
        for (int i = 0; i < size; i++) {
            cadena[i]=(String) ciudades.getCiudadNodoporIndice(i).getDato();
        }
        return cadena;
    }
        
        
    
    
        
        
        
        
        
        
    
    
    
    
}


  