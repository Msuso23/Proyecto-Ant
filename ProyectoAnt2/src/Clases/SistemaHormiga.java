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
    private double c;
    private Grafo grafo;
    private Vertice ciudadInicio;
    private Vertice ciudadFinal;
    private double q;
    private Lista recorridoOptimo;
    private double distanciOptima;
    private Lista historial;
    private Lista historialTemporal;

    public SistemaHormiga(int ciclos, Lista hormigas, double alfa, double beta, double rho, Grafo grafo, Vertice ciudadInicio, Vertice ciudadFinal, double q) {
        this.ciclos = ciclos;
        this.hormigas = hormigas;
        this.a = alfa;
        this.b = beta;
        this.c = rho;
        this.grafo = grafo;
        this.ciudadInicio = ciudadInicio;
        this.ciudadFinal = ciudadFinal;
        this.q = q;
        this.recorridoOptimo = new Lista();
        this.distanciOptima = 0;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo grafo) {
        this.grafo = grafo;
    }

    public Vertice getCiudadInicio() {
        return ciudadInicio;
    }

    public void setCiudadInicio(Vertice ciudadInicio) {
        this.ciudadInicio = ciudadInicio;
    }

    public Vertice getCiudadFinal() {
        return ciudadFinal;
    }

    public void setCiudadFinal(Vertice ciudadFinal) {
        this.ciudadFinal = ciudadFinal;
    }

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }

    public Lista getRecorridoOptimo() {
        return recorridoOptimo;
    }

    public void setRecorridoOptimo(Lista recorridoOptimo) {
        this.recorridoOptimo = recorridoOptimo;
    }

    public double getDistanciOptima() {
        return distanciOptima;
    }

    public void setDistanciOptima(double distanciOptima) {
        this.distanciOptima = distanciOptima;
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
            hormiga.setCiudadActual(ciudadInicio);
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

    
    public void evaporacionFeromonas(){
    
    }
    
    public void incrementoFeromonas(){
    
    }
    
    
    
//    public double inicializarFeromonas(Grafo grafo) {
//        // Inicializar la variable feromonas
//        setFeromonas(0.0);
//        int numCiudades = grafo.getVertices();
//        double feromonas = 1 / numCiudades; // Calcular la cantidad inicial de feromonas
//        return feromonas;
//    }
    
    
    

    
    
        
        
    
}
  
  
