
package Clases;

import EDD.Lista;
import EDD.Arista;
import EDD.Vertice;
import Interfaces.InterfaceFunctions;
import javax.swing.JOptionPane;

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
    
    public Hormiga(Vertice ciudadActual){
        this.ciudadActual = ciudadActual;
        this.CiudadesRecorridas = new Lista();
        this.CiudadesRecorridas.insertarFinal(ciudadActual);
        this.longitud = 0;
    }

    //Getters y Setters
    
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
    
    
    //Metodo para que una hormiga visite una ciudad sin que vaya a una ciudad visitada o que no este conectada a la ciudad actual
    public void visitarCiudad(int NumeroCiudad, double distancia){
        if (ciudadActual.buscarArista2(NumeroCiudad)!=null){
            if (!this.visitado(NumeroCiudad)){
                Arista arista = ciudadActual.buscarArista2(NumeroCiudad);
                this.setCiudadActual(arista.getCiudadDestino());
                longitud += arista.getDistancia();
                Vertice ciudadVisitada = InterfaceFunctions.getGrafo().buscarVertice2(NumeroCiudad);
                CiudadesRecorridas.insertarFinal(ciudadVisitada);
            }else{
            JOptionPane.showMessageDialog(null, "Ya visitaste esta ciudad.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Las ciudades no se encuentran conectadas");
        }        
    }
    
    //Metodo que retorna un boolean para saber si una ciudad ha sido visitada 
    public boolean visitado(int NumeroCiudad) {
        boolean fueVisitada = false;
        for (int i = 0; i < this.CiudadesRecorridas.getSize(); i++) {
            Vertice ciudadActual = (Vertice) CiudadesRecorridas.getValor(i);
            if (ciudadActual.getNumeroCiudad() == NumeroCiudad) {
                fueVisitada = true;
                return fueVisitada;
            }
        }
        return fueVisitada;
    }

    
}  
