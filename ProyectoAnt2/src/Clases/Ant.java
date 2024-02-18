
package Clases;


import EDD.Vertice;

/**
 *
 * @author Camila Garcia
 */
public class Ant {
    private Vertice ciudadActual;
    private Vertice ciudadesRecorridas;
    private double longitud;

    public Ant(Vertice ciudadActual, Vertice ciudadesRecorridas) {
        this.ciudadActual = ciudadActual;
        this.ciudadesRecorridas = ciudadesRecorridas;
        this.longitud = 0;
    }

    public Vertice getCiudadActual() {
        return ciudadActual;
    }

    public void setCiudadActual(Vertice ciudadActual) {
        this.ciudadActual = ciudadActual;
    }

    public Vertice getCiudadesRecorridas() {
        return ciudadesRecorridas;
    }

    public void setCiudadesRecorridas(Vertice ciudadesRecorridas) {
        this.ciudadesRecorridas = ciudadesRecorridas;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
 
}  
