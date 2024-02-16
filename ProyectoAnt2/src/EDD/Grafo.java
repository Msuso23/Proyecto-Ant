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
    
    private int vertices;
    private Lista ListaCiudades;

    public Grafo(int vertices, Lista ListaCiudades) {
        this.vertices = vertices;
        this.ListaCiudades = ListaCiudades;
    }

    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
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
    public boolean isVertex(int ciudad) {
        if (isEmpty()) {
            return false;
        } else {
            for (int indice = 0; indice < ListaCiudades.getSize(); indice++) {
                Vertice vertex = (Vertice) ListaCiudades.getValor(indice);
                if (vertex.getNumeroCiudad() == ciudad) {
                    return true;
                }
            }
            return false;
        }
    }

    public void agregarVertice(int ciudad) {
        if (!isVertex(ciudad)) {
            Vertice Vertex = new Vertice(ciudad, null);
            ListaCiudades.InsertarFinal(Vertex);
        } else {
            JOptionPane.showMessageDialog(null, "Error.");
        }
    }
            
    public void eliminarVertice(int ciudad) {
        if (isEmpty()) {
            System.out.println("El grafo está vacío. No hay vértices que eliminar.");
        } else if (isVertex(ciudad)) {
            for (int indice = 0; indice < ListaCiudades.getSize(); indice++) {
                Vertice vertex = (Vertice) ListaCiudades.getValor(indice);
                if (vertex.getNumeroCiudad() == ciudad) {
                    ListaCiudades.EliminarPorPosicion(indice);
                    JOptionPane.showMessageDialog(null, "Vértice " + ciudad + " eliminado.");
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, " El Vértice " + ciudad + " no existe en el grafo.");
        }
}
    //Verifica si existe un vértice con el número de ciudad especificado en la lista de adyacencia proporcionada.
    public boolean existeVertice(Lista list_ady, int NumeroCiudad) {
        for (int i = 0; i < list_ady.getSize(); i++) {
            Vertice v = (Vertice) list_ady.getValor(i);
            if (v.getNumeroCiudad() == NumeroCiudad) {
                return true;
            }
        }
        return false;
    }
    
    //Agregar una arista dado dos vertices y su distancia 
        
    public void agregar(Vertice ciudadInicio, Vertice ciudadDestino, double distancia){
        Arista arista = new Arista(ciudadInicio, ciudadDestino, distancia);
        if (isVertex(ciudadInicio.getNumeroCiudad()) && isVertex(ciudadDestino.getNumeroCiudad())) {
            ciudadInicio.getList_ady().InsertarFinal(arista);
        } else {
         JOptionPane.showMessageDialog(null, "No se puede agregar la arista");
        }
    }
    
    
}
