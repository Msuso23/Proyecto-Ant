
package Clases;

import EDD.Lista;
import EDD.Vertice;

/**
 *
 * @author Camila Garcia
 */
public class Hormiga {
    private Vertice ciudadActual;
    private Lista CiudadesRecorridas;
    private double longitud;
 

    //Constructor

    public Hormiga() {
        this.ciudadActual = null;
        this.CiudadesRecorridas = new Lista();
        this.longitud = 0;
    }

    public Vertice getCiudadActual() {
        return ciudadActual;
    }

    public void setCiudadActual(Vertice ciudadActual) {
        this.ciudadActual = ciudadActual;
    }

    public Lista getCiudadesRecorridas() {
        return CiudadesRecorridas;
    }

    public void setCiudadesRecorridas(Lista CiudadesRecorridas) {
        this.CiudadesRecorridas = CiudadesRecorridas;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    
    
}  
