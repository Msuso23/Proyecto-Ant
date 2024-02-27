/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


public class Historial {
    private String ciclo;
    private String recorridoHormigas;
    private String caminoOptimo;
    private double distanciaOptima;

    public Historial(String ciclo, String recorridoHormigas, String caminoOptimo, double distanciaOptima) {
        this.ciclo = ciclo;
        this.recorridoHormigas = recorridoHormigas;
        this.caminoOptimo = caminoOptimo;
        this.distanciaOptima = distanciaOptima;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getRecorridoHormigas() {
        return recorridoHormigas;
    }

    public void setRecorridoHormigas(String recorridoHormigas) {
        this.recorridoHormigas = recorridoHormigas;
    }

    public String getCaminoOptimo() {
        return caminoOptimo;
    }

    public void setCaminoOptimo(String caminoOptimo) {
        this.caminoOptimo = caminoOptimo;
    }

    public double getDistanciaOptima() {
        return distanciaOptima;
    }

    public void setDistanciaOptima(double distanciaOptima) {
        this.distanciaOptima = distanciaOptima;
    }
    
    
    
}
