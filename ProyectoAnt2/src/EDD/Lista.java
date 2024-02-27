/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import EDD.Nodo;
import javax.swing.JOptionPane;

/**
 *
 * @author nicolepinto
 */
public class Lista {
   
    private Nodo pFirst; 
    private int size; 
    
    public Lista() {
        this.pFirst = null;
        this.size = 0; 
    }
    
    public Nodo getpFirst() {
        return pFirst;
    }

    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    public boolean isEmpty(){
        return this.pFirst == null;
    }
    

    public void vaciar(){
        this.pFirst = null;
        this.size = 0;   
    }

    public void insertarFinal(Object dato){
        Nodo pNew = new Nodo(dato);
        if(isEmpty()){
            pFirst = pNew;
        }else{
            Nodo aux = pFirst;
            while (aux.getPnext() != null){
                aux = aux.getPnext();
            }
            aux.setPnext(pNew);
        }
        size++;
    }
    
    //Metodo de insertar un valor por una posicion 
    public void insertarPosicion(int posicion, Object valor){
        if(posicion>=0 && posicion<size){
            Nodo nuevo = new Nodo(valor);
            if(posicion == 0){
                nuevo.setPnext(pFirst);
                pFirst = nuevo;
            }
            else{
                if(posicion == size-1){
                    Nodo aux = pFirst;
                    while(aux.getPnext() != null){
                        aux = aux.getPnext();
                    }
                    aux.setPnext(nuevo);              
                }
                else{
                    Nodo aux = pFirst;
                    for (int i = 0; i < (posicion-1); i++) {
                        aux = aux.getPnext();
                    }
                    Nodo siguiente = aux.getPnext();
                    aux.setPnext(nuevo);
                    nuevo.setPnext(siguiente);
                }
            }
            size++;
        }
    }
    
// Permite insertar un nuevo nodo después de un nodo específico en la lista enlazada
    
    public void insertarReferencia(Object ref, Object valor) {

        Nodo nuevo = new Nodo();
        nuevo.setDato(valor);

        if (!isEmpty()) {
            if (buscar(ref)) {
                Nodo aux = pFirst;
                while (aux.getDato() != ref) {
                    aux = aux.getPnext();
                }
                Nodo siguiente = aux.getPnext();
                aux.setPnext(nuevo);
                nuevo.setPnext(siguiente);

                size++;
            }
        }
    }
    
    // Transforma los datos almacenados en la lista en una cadena de caracteres para su visualización, 
    // línea por línea, y devuelve esta representación como un String
    
    public String Transformar(){
        if(!isEmpty()){
            
            Nodo aux = pFirst;
            String expresion = "";
            
            for(int i = 0; i <size;i++){
            expresion += aux.getDato().toString() + "\n";
            aux = aux.getPnext();
            }
            return expresion;
        }
        return "Lista vacia";
    }
    
    //Transforma los datos almacenados en la lista en una representación de cadena de caracteres para su visualización, 
    //donde los nombres de las ciudades están separados por comas
    
    public String transformarCiudad(){
        if (!isEmpty()){
            
            Nodo aux = pFirst;
            String expresion = "";
            
            for (int i = 0; i < size; i++) {
            expresion += aux.getDato().toString() + ",";
            aux = aux.getPnext();
            }
            return expresion;           
        }
        return "Lista Vacia";
    }

    //Elimina el primer nodo de la lista. Si la lista no está vacía, mueve el puntero pFirst al siguiente nodo en la lista y reduce el tamaño
    
    public boolean eliminarInicio(){
        if(!isEmpty()){
            pFirst = pFirst.getPnext();
            size--;
            return true;
        }else{
            return false;
        }
    }
    
    //Elimina el último nodo de la lista. Si la lista no está vacía, elimina el último nodo ajustando los punteros
    
    public void eliminarFinal(){
        if(!isEmpty()){
            if (getSize()==1) {
                vaciar();
            }else{
                Nodo pointer = getpFirst();
                while(pointer.getPnext() != null && pointer.getPnext().getPnext()!= null){
                    pointer = pointer.getPnext();
                }
                pointer.setPnext(null);
            }
        }
        size --;
    }
    
    //Elimina el nodo que contiene el dato de referencia pasado como argumento
    
    public void eliminarReferencia(Object referencia){

        if (buscar(referencia)) {
            if (pFirst.getDato() == referencia) {
                pFirst = pFirst.getPnext();
            } else{
                Nodo aux = pFirst;
                while(aux.getPnext().getDato() != referencia){
                    aux = aux.getPnext();
                }
                Nodo siguiente = aux.getPnext().getPnext();
                aux.setPnext(siguiente);  
            }
            size--;
        }
    }
    
    //Elimina el nodo en la posición especificada
    
    public void eliminarPosicion(int posicion){

        if(posicion>=0 && posicion<size){
            if(posicion == 0){
                pFirst = pFirst.getPnext();
            }
            else{
                Nodo aux = pFirst;
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getPnext();
                }
                Nodo siguiente = aux.getPnext();
                aux.setPnext(siguiente.getPnext());
            }
            size--;
        }
    }
    
    // Edita el valor del nodo que contiene la referencia especificada, cambiándolo por el dato pasado como argumento
    
    public void editarReferencia(Object referencia, Object dato){
        if (buscar(referencia)) {
            Nodo aux = pFirst;
            while(aux.getDato() != referencia){
                aux = aux.getPnext();
            }
            aux.setDato(dato);
        }
    }
    
    // Edita el valor del nodo en la posición especificada por el dato pasado como argumento
    
    public void editarPosicion(int posicion , Object dato){

        if(posicion>=0 && posicion<size){
            if(posicion == 0){
                pFirst.setDato(dato);
            }
            else{
                Nodo aux = pFirst;

                for (int i = 0; i < posicion; i++) {
                    aux = aux.getPnext();
                }
                aux.setDato(dato);
            }
        }
    }
    
    // Devuelve el valor almacenado en el nodo en la posición especificada
    
    public Object getValor(int posicion){

        if(posicion>=0 && posicion<size){
            
            if (posicion == 0) {
                return pFirst.getDato();
            }else{
                Nodo aux = pFirst;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getPnext();
                }
                return aux.getDato();
            }
        }
        return null;
    }
    
    // Devuelve la posición del nodo que contiene el dato de referencia pasado como argumento
    
    public int getPosicion(Object referencia){

        if (buscar(referencia)) {
            
            Nodo aux = pFirst;
            int cont = 0;
            while(referencia != aux.getDato()){
                cont ++;
                aux = aux.getPnext();
            }
            return cont;
        } else {
            return -1;
        }
    }
    
    // Busca la referencia en la lista y devuelve true si se encuentra, false en caso contrario
    
    public boolean buscar(Object referencia){
        Nodo aux = pFirst;
        boolean encontrado = false;
        while(aux != null && encontrado != true){
            if (referencia == aux.getDato()){ 
                encontrado = true;
            }
            else{
                aux = aux.getPnext();
            }
        }
        return encontrado;
    }
    
    public void mostrar(){
        if (!isEmpty()){
            Nodo aux = pFirst;
            String expresion = "";
            while(aux != null){
               expresion = expresion + aux.getDato().toString() + "\n";
               aux = aux.getPnext();
            }
            JOptionPane.showMessageDialog(null,expresion);
            
        }else{
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
    }
       
}


    
    
    
    
    
    
