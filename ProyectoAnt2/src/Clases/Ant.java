
package Clases;

import EDD.Vertice;

/**
 *
 * @author Camila Garcia
 */
public class Ant {
    private Vertice ciudadActual;
    private Vertice CiudadesRecorridas;
    private double longitud;
 

    //Constructor

    public Ant(Vertice ciudadActual, Vertice CiudadesRecorridas, double longitud) {
        this.ciudadActual = ciudadActual;
        this.CiudadesRecorridas = CiudadesRecorridas;
        this.longitud = longitud;
    }

    public Vertice getCiudadActual() {
        return ciudadActual;
    }

    public void setCiudadActual(Vertice ciudadActual) {
        this.ciudadActual = ciudadActual;
    }

    public Vertice getCiudadesRecorridas() {
        return CiudadesRecorridas;
    }

    public void setCiudadesRecorridas(Vertice CiudadesRecorridas) {
        this.CiudadesRecorridas = CiudadesRecorridas;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    
    
}  
