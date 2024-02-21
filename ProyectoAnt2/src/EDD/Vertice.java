
package EDD;

import Funciones.Messages;

/**
 *
 * @author nicolepinto
 */
public class Vertice {
    
    private int NumeroCiudad;
    private Lista list_ady;

    public Vertice(int NumeroCiudad) {
        this.NumeroCiudad = NumeroCiudad;
        this.list_ady = new Lista();
    }

    public int getNumeroCiudad() {
        return NumeroCiudad;
    }

    public void setNumeroCiudad(int NumeroCiudad) {
        this.NumeroCiudad = NumeroCiudad;
    }

    public Lista getList_ady() {
        return list_ady;
    }

    public void setList_ady(Lista list_ady) {
        this.list_ady = list_ady;
    }

    public int buscarArista(Arista arista){
        
        if (arista.getCiudadInicio().getNumeroCiudad() == NumeroCiudad){
            Nodo aux = list_ady.getpFirst();
            while(aux != null){
                Arista a = (Arista) aux.getDato();
                if (a.getCiudadDestino().getNumeroCiudad() == arista.getCiudadDestino().getNumeroCiudad()){
                return 1;
                }
                aux = aux.getPnext();
            }
            return 0;
        }
       return -1;
    
    }
    
    public Arista buscarArista2(int NumeroCiudad){
        Nodo aux = list_ady.getpFirst();
        while (aux != null){
            Arista pointer = (Arista) aux.getDato();
            if (pointer.getCiudadDestino().getNumeroCiudad() == NumeroCiudad){
                return pointer;
            }
            aux = aux.getPnext();    
        }
        return null;
    
    }
    
    public void agregarArista(Arista arista){
        if (buscarArista(arista) == 0) {
            list_ady.insertarFinal(arista);
            Messages.information("¡Arista insertada exitosamente!");
        }
        else if (buscarArista(arista) == 1){
            Messages.error("¡La arista ya existe!");
        }
        else{
            Messages.error("¡Arista inválida!");
        }
        
    }
    
    public void eliminarArista(Arista arista){
        if (buscarArista(arista) == 1) {
            list_ady.eliminarReferencia(arista);
            Messages.information("¡Arista eliminada exitosamente!");
        }
        else if (buscarArista(arista) == 0){
            Messages.error("¡La arista no está en lista de adyacencia!");
        }
        else{
            Messages.error("¡Arista inválida!");
        }
    
    }
    
}
