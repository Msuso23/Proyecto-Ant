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
    

        public void insertarReferencia(Object ref,Object valor){
        
        Nodo nuevo = new Nodo();
        nuevo.setDato(valor);
        
        if (!isEmpty()) {
            if (buscar(ref)) {
                Nodo aux = pFirst;
                // Recorre la lista hasta llegar al nodo de referencia.
                while (aux.getDato() != ref) {
                    aux = aux.getPnext();
                }
                // Crea un respaldo de la continuación de la lista.
                Nodo siguiente = aux.getPnext();
                // Enlaza el nuevo nodo despues del nodo de referencia.
                aux.setPnext(nuevo);
                // Une la continuacion de la lista al nuevo nodo.
                nuevo.setPnext(siguiente);
            
                size++;
            }
        }
    }
    
        
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

    public boolean eliminarInicio(){
        if(!isEmpty()){
            pFirst = pFirst.getPnext();
            size--;
            return true;
        }else{
            return false;
        }
    }
    
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
    
    public void editarReferencia(Object referencia, Object dato){
        if (buscar(referencia)) {
            Nodo aux = pFirst;
            while(aux.getDato() != referencia){
                aux = aux.getPnext();
            }
            aux.setDato(dato);
        }
    }
    
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
    
    
    public Nodo getNodo(int posicion){

        if(posicion>=0 && posicion<size){
            
            if (posicion == 0) {
                return pFirst;
            }else{
                Nodo aux = pFirst;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getPnext();
                }
                return aux;
            }
        }
        return null;
    }
    
    
    public int getIndex (Nodo nodito){
        if (!isEmpty()){
            Nodo aux = pFirst;
            int count = 0;
            while(aux != null){
                
                if (nodito == aux){
                    return count;     
                }
                count ++;
                aux = aux.getPnext();
            }
            return -1;
        }
    return -1;
    }
    
    
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


    
    
    
    
    
    
