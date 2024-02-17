/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author nicolepinto
 */
public class Arista {
    
    private Vertice ciudadInicio;
    private Vertice ciudadDestino;
    private double distancia;

    public Arista(Vertice ciudadInicio, Vertice ciudadDestino, double distancia) {
        this.ciudadInicio = ciudadInicio;
        this.ciudadDestino = ciudadDestino;
        this.distancia = distancia;
    }

    public Vertice getCiudadInicio() {
        return ciudadInicio;
    }

    public void setCiudadInicio(Vertice ciudadInicio) {
        this.ciudadInicio = ciudadInicio;
    }

    public Vertice getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(Vertice ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    

}
