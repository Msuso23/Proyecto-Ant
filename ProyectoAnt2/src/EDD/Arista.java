/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import EDD.Vertice;

/**
 *
 * @author nicolepinto
 */
public class Arista {
    
    private Vertice ciudadInicio;
    private Vertice ciudadDestino;
    private double distancia;
    private double feromonas;

    public Arista(Vertice ciudadInicio, Vertice ciudadDestino, double distancia) {
        this.ciudadInicio = ciudadInicio;
        this.ciudadDestino = ciudadDestino;
        this.distancia = distancia;
        this.feromonas = 0;
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

    public double getFeromonas() {
        return feromonas;
    }

    public void setFeromonas(double feromonas) {
        this.feromonas = feromonas;
    }
    
    

}
