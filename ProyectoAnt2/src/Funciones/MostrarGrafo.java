/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import EDD.Arista;
import EDD.Grafo;
import EDD.Lista;
import EDD.Nodo;
import EDD.Vertice;
import org.graphstream.graph.EdgeRejectedException;
import org.graphstream.graph.ElementNotFoundException;
import org.graphstream.graph.Graph;
import org.graphstream.graph.IdAlreadyInUseException;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;

/**
 *
 * @author nicolepinto
 */
public class MostrarGrafo {

    // Controlador de GraphStream
    private Viewer viewer;

    public void initGraphStream(Grafo myGraph) {
        
        Graph gs = createGraphStream(myGraph);
        String styleSheet
                = "edge {"
                + "	size: 1px;"
                + "	fill-color: #CCCCCC;"
                + "	fill-mode: dyn-plain;"
                + "     text-color: #ffffff;"
                + "}"
                + "node {"
                + "	size: 12px;"
                + "	fill-color: #990000;"
                + "     text-color: #FFD700;"
                + "}"
                + "graph {"
                + "     fill-color: #333333;"
                + "}";

        // GraphStream config
        System.setProperty("org.graphstream.ui", "swing");
        gs.setAttribute("ui.stylesheet", styleSheet);
        gs.setAttribute("ui.quality");
        gs.setAttribute("ui.antialias");
        gs.display().setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
    }

    private Graph createGraphStream(Grafo myGraph) {
        Graph gs = new SingleGraph("Interfaz del grafo");
        // ------------------------------
        // Agregamos nodos/vertices
        {
            Nodo aux = myGraph.getListaCiudades().getpFirst();
            while (aux != null) {
                Vertice v = (Vertice) aux.getDato();
                gs.addNode(v.toString()).setAttribute("ui.label", v.toString());
                aux = aux.getPnext();
            }
        }

        // Agregamos aristas
        {
            Nodo aux = myGraph.getListaCiudades().getpFirst();
            while (aux != null) {
                Vertice v = (Vertice) aux.getDato();
                Lista lista_ady = v.getList_ady();
                Nodo aux2 = lista_ady.getpFirst();
                while (aux2 != null) {
                    Arista arista = (Arista) aux2.getDato();
                    String id = arista.getCiudadInicio().toString() + "-" + arista.getCiudadDestino().toString();

                    try {
                        gs.addEdge(id, arista.getCiudadInicio().toString(), arista.getCiudadDestino().toString()).setAttribute("ui.label", arista.getDistancia());
                    } catch (EdgeRejectedException | ElementNotFoundException | IdAlreadyInUseException ex) {
                    }

                    // ----------
                    aux2 = aux2.getPnext();
                }
                aux = aux.getPnext();
            }
        }

        // ------------------------------
        return gs;
    }
}
