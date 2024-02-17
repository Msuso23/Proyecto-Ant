/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import javax.swing.JOptionPane;

/**
 *
 * @author nicolepinto
 */
public class Grafo {
    private Lista ListaCiudades;

    public Grafo() {
        this.ListaCiudades = new Lista();
    }

    public Lista getListaCiudades() {
        return ListaCiudades;
    }

    public void setListaCiudades(Lista ListaCiudades) {
        this.ListaCiudades = ListaCiudades;
    }
    
    public boolean isEmpty() {
        return ListaCiudades.getSize()== 0;
    }

    
    // Se utiliza para verificar si un vértice con un número de ciudad específico existe en el grafo.
    public boolean isVertex(Vertice ciudades) {
        if (isEmpty()) {
            return false;
        } else {
            int numVert = ciudades.getNumeroCiudad();

            for (int indice = 0; indice < ListaCiudades.getSize(); indice++) {
                Vertice vertex = (Vertice) ListaCiudades.getValor(indice);
                if (vertex.getNumeroCiudad() == numVert) {
                    return true;
                }
            }
            return false;
        }
    }
    
    //Agregar ciudad al grafo

    public void agregarVertice(Vertice ciudades) { 
        if (!isVertex(ciudades)) {
            ListaCiudades.insertarFinal(ciudades);
            JOptionPane.showMessageDialog(null, "Vertice insertado con exito.");

        } else {
            JOptionPane.showMessageDialog(null, "El vertice ya existe");
        }
    }
    
    
     //Eliminar ciudad al grafo
            
    public void eliminarVertice(Vertice ciudad) {
        if (isEmpty()) {
            System.out.println("El grafo está vacío. No hay vértices que eliminar.");
        } else if (isVertex(ciudad)) {
            ListaCiudades.eliminarReferencia(ciudad);
            JOptionPane.showMessageDialog(null, "Vértice eliminado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "El vértice no existe en el grafo.");
        }
    }
    
    public boolean buscarArista(Arista arista) {  //Aca falta que cristian haga el metodo de buscar arista para queme salga bine
        for (int i = 0; i < ListaCiudades.getSize(); i++) {
            Vertice vertice = (Vertice) ListaCiudades.getValor(i);
            if (vertice.buscarArista(arista) == 1) {
                return true;
            }
        }

        return false;
    }
    
    public void agregarArista(Arista arista) {
        if (!buscarArista(arista)) {
            for (int i = 0; i < ListaCiudades.getSize(); i++) {
                Vertice ciudades = (Vertice) ListaCiudades.getValor(i);
                if (ciudades.getNumeroCiudad() == arista.getCiudadInicio().getNumeroCiudad()) {
                    ciudades.getList_ady().insertarFinal(arista);
                }else if(ciudades.getNumeroCiudad() == arista.getCiudadDestino().getNumeroCiudad()){
                    Arista arista2 = new Arista(ciudades, arista.getCiudadInicio(), arista.getDistancia());
                    ciudades.getList_ady().insertarFinal(arista2);
                }
            }
            
            JOptionPane.showMessageDialog(null, "Arista agregada.");
            
        } else {
            JOptionPane.showMessageDialog(null, "La Arista ya existe");
        }
    }
    
        public void eliminarArista(Arista arista){
       if (buscarArista(arista)) {
            for (int i = 0; i < ListaCiudades.getSize(); i++) {
                Vertice ciudades = (Vertice) ListaCiudades.getValor(i);
                if (ciudades.getNumeroCiudad() == arista.getCiudadInicio().getNumeroCiudad()) {
                    ciudades.getList_ady().eliminarReferencia(arista);
                }else if(ciudades.getNumeroCiudad()== arista.getCiudadDestino().getNumeroCiudad()){
                    Arista arista2 = new Arista(ciudades, arista.getCiudadInicio(), arista.getDistancia());
                    ciudades.getList_ady().eliminarReferencia(arista2);
                }
            }
            JOptionPane.showMessageDialog(null, "Arista eliminada.");
            
        } else {
            JOptionPane.showMessageDialog(null, "La Arista no existe.");
        }
    }

    
     //Se usa en la interfaz para devolver la ciudad que tenga el numero ingresado por el usuario
    public Vertice buscarVertice2(int vertice) {
        for (int i = 0; i < ListaCiudades.getSize(); i++) {
            Vertice ciudades = (Vertice) ListaCiudades.getValor(i);
            if (ciudades.getNumeroCiudad() == vertice) {
                return ciudades;
            }
        }
        return null;
    }
    
    public String toString() { 
        StringBuilder sb = new StringBuilder();
        sb.append("Ciudades:\n");
        for (int i = 0; i < ListaCiudades.getSize();i++) {
            Vertice ciudad = (Vertice) ListaCiudades.getValor(i);
            sb.append(ciudad.getNumeroCiudad()).append("\n");
        }
        sb.append("Aristas:\n");
        for (int i = 0; i < ListaCiudades.getSize();i++) {
            Vertice ciudad = (Vertice) ListaCiudades.getValor(i);
            for (int j = 0; j < ciudad.getList_ady().getSize();j++) {
                Arista arista = (Arista) ciudad.getList_ady().getValor(j);
                if(arista.getCiudadDestino().getNumeroCiudad() > ciudad.getNumeroCiudad()){
                    sb.append(arista.getCiudadInicio().getNumeroCiudad()).append(" ,").append(arista.getCiudadDestino().getNumeroCiudad()).append(" ,").append(arista.getDistancia()).append("\n");
                }
                
            }
        }
        return sb.toString();
    }
}
