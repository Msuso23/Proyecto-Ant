/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Arista;
import EDD.Grafo;
import EDD.Lista;
import EDD.Vertice;

/**
 *
 * @author nicolepinto
 */
public class SistemaHormiga {
    private int ciclos;
    private Lista hormigas;
    private double a;
    private double b;
    private double r;
    private double q;
    private Grafo grafo;
    private Vertice ciudadInicial;
    private Vertice ciudadFinal;
    private Lista recorridoOptimo;
    private double distanciaOptima;
    private Lista historial;
    private Lista historialTemporal;
    

    public SistemaHormiga(int ciclos, Lista hormigas, double a, double b, double r, double q, Grafo grafo, Vertice ciudadInicial, Vertice ciudadFinal) {
        this.ciclos = ciclos;
        this.hormigas = hormigas;
        this.a = a;
        this.b = b;
        this.r = r;
        this.q = q;
        this.grafo = grafo;
        this.ciudadInicial = ciudadInicial;
        this.ciudadFinal = ciudadFinal;
        this.recorridoOptimo = new Lista();
        this.distanciaOptima = 0;
        this.historial = new Lista();
        this.historialTemporal = new Lista();
    }

    public int getCiclos() {
        return ciclos;
    }

    public void setCiclos(int ciclos) {
        this.ciclos = ciclos;
    }

    public Lista getHormigas() {
        return hormigas;
    }

    public void setHormigas(Lista hormigas) {
        this.hormigas = hormigas;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }

    public Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo grafo) {
        this.grafo = grafo;
    }

    public Vertice getCiudadInicial() {
        return ciudadInicial;
    }

    public void setCiudadInicial(Vertice ciudadInicial) {
        this.ciudadInicial = ciudadInicial;
    }

    public Vertice getCiudadFinal() {
        return ciudadFinal;
    }

    public void setCiudadFinal(Vertice ciudadFinal) {
        this.ciudadFinal = ciudadFinal;
    }

    public Lista getRecorridoOptimo() {
        return recorridoOptimo;
    }

    public void setRecorridoOptimo(Lista recorridoOptimo) {
        this.recorridoOptimo = recorridoOptimo;
    }

    public double getDistanciaOptima() {
        return distanciaOptima;
    }

    public void setDistanciaOptima(double distanciaOptima) {
        this.distanciaOptima = distanciaOptima;
    }

    public Lista getHistorial() {
        return historial;
    }

    public void setHistorial(Lista historial) {
        this.historial = historial;
    }

    public Lista getHistorialTemporal() {
        return historialTemporal;
    }

    public void setHistorialTemporal(Lista historialTemporal) {
        this.historialTemporal = historialTemporal;
    }

    public void simulacion() {
        for (int i = 0; i < this.ciclos; i++) {
            for (int j = 0; j < hormigas.getSize(); j++) {
                Hormiga hormigaActual = (Hormiga) hormigas.getValor(j);
                this.recorridoCompleto(hormigaActual);  
            }
            this.evaporacionFeromonas();
            this.reiniciarHormigas();
        }
    }
    
    public void reiniciarHormigas(){
        for (int i = 0; i < hormigas.getSize(); i++) {
            Hormiga hormiga = (Hormiga) hormigas.getValor(i);
            hormiga.setCiudadActual(ciudadInicial);
            hormiga.getCiudadesRecorridas().vaciar();
            hormiga.setLongitud(0);
            hormigas.editarPosicion(i, hormiga);
        }
    }

    public void recorridoCompleto(Hormiga hormiga) {
        for (int i = 0; i < grafo.getListaCiudades().getSize(); i++) {
            if(hormiga.getCiudadActual().getNumeroCiudad() != ciudadFinal.getNumeroCiudad()){
                Lista ciudadesCandidatas = ciudadesCandidatas(hormiga);
                if(ciudadesCandidatas.getSize() != 0){
                    Lista probabilidades = probabilidades(ciudadesCandidatas);
                    Vertice ciudadProxima = decidirCiudadProxima(ciudadesCandidatas, probabilidades);
                    Arista arista = hormiga.getCiudadActual().buscarArista2(ciudadProxima.getNumeroCiudad());
                    hormiga.visitarCiudad(ciudadProxima.getNumeroCiudad(), arista.getDistancia());
                    this.incrementoFeromonas();
                }
                break;
            }
            break;
        }

    }

    public Lista ciudadesCandidatas(Hormiga hormiga) {
        Vertice ciudadActual = hormiga.getCiudadActual();
        Lista ciudadesCandidatas = new Lista();
        
        for (int i = 0; i < ciudadActual.getList_ady().getSize(); i++) {
            Arista aristaActual = (Arista) ciudadActual.getList_ady().getValor(i);
            if(!hormiga.visitado(aristaActual.getCiudadDestino().getNumeroCiudad())){
                ciudadesCandidatas.insertarFinal(aristaActual);
            }
        }
        
        return ciudadesCandidatas;
    }

    public Lista probabilidades(Lista ciudadesCandidatas) {
        double sumaProbabilidades = 0;
        Lista probabilidades = new Lista();
        
        for (int i = 0; i < ciudadesCandidatas.getSize(); i++) {
            Arista aristaActual = (Arista) ciudadesCandidatas.getValor(i);
            double t = Math.pow(aristaActual.getFeromonas(), this.a);
            double n = Math.pow(this.q/aristaActual.getDistancia(), this.b);
            double probabilidad = t * n;
            sumaProbabilidades += probabilidad;
            probabilidades.insertarFinal(probabilidad);
        }
        
        for (int i = 0; i < probabilidades.getSize(); i++) {
            double probActual = (double) probabilidades.getValor(i) / sumaProbabilidades;
            probabilidades.editarReferencia(probabilidades.getValor(i), probActual);
        }
        
        return probabilidades;
    }
    
    public Vertice decidirCiudadProxima(Lista ciudadesCandidatas, Lista probabilidades){
        int posicion = -1;
        double mayorPorbabilidad = 0;
        
        for (int i = 0; i < probabilidades.getSize(); i++) {
            double probActual = (double) probabilidades.getValor(i);
            if(probActual > mayorPorbabilidad){
                mayorPorbabilidad = probActual;
                posicion = i;         
            }
        }
        
        Arista aristaFinal = (Arista) ciudadesCandidatas.getValor(posicion);
        
        return aristaFinal.getCiudadDestino();
    }

  
    public void incrementoFeromonas(){
    
    }
    
    
    public void evaporacionFeromonas(){
        for (int i = 0; i < grafo.getListaCiudades().getSize(); i++) {
            Vertice ciudadActual = (Vertice) grafo.getListaCiudades().getValor(i);
            for (int j = 0; j < ciudadActual.getList_ady().getSize(); j++) {
                Arista aristaActual = (Arista) ciudadActual.getList_ady().getValor(j);
                double evaporar = (1-r)*aristaActual.getFeromonas();
                aristaActual.setFeromonas(evaporar);
            }
        }
    }
    
    public void incrementoFeromonas(Hormiga hormiga){
        
        
        
    }

    public String toStringHistorial(){
        String historialCompleto = "";
        for (int i = 0; i <this.historial.getSize(); i++) {
            Historial historial = (Historial) this.historial.getValor(i);
            historialCompleto += historial.toString() + ("\n");
        }
        return historialCompleto;
    }
        
        
    
}
  
  
