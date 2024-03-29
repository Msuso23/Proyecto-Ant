/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Arista;
import EDD.Grafo;
import EDD.Lista;
import EDD.Vertice;
import java.util.Random;
import javax.swing.JOptionPane;

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
    
   

    //Se encarga iniciar el recorrido de cada hormiga y llevar el record de los mismos
    public void simulacion() {
        for (int i = 0; i < this.ciclos; i++) {
            String titulo = "Ciclo " + (i + 1);
            for (int j = 0; j < hormigas.getSize(); j++) {
                Hormiga hormigaActual = (Hormiga) hormigas.getValor(j);
                this.recorridoCompleto(hormigaActual);
                HistorialHormiga historiala = new HistorialHormiga(j, hormigaActual.getCiudadesRecorridas().transformarCiudad(), String.valueOf(hormigaActual.getLongitud()));
                historialTemporal.insertarFinal(historiala);
                JOptionPane.showMessageDialog(null, historiala.toStringP());
                System.out.println(historiala.toStringP());
            }
            Historial historial2 = new Historial(titulo, historialTemporal.Transformar(), this.recorridoOptimo.transformarCiudad(), this.distanciaOptima);            
            this.historial.insertarFinal(historial2);
            this.evaporacionFeromonas();
            this.reiniciarHormigas();
            this.historialTemporal.vaciar();
            
            JOptionPane.showMessageDialog(null, "La distancia optima es: "+distanciaOptima);
        }
    }



    public void recorridoCompleto(Hormiga hormiga) {
        for (int i = 0; i < this.grafo.getListaCiudades().getSize(); i++) {
            if (hormiga.getCiudadActual().getNumeroCiudad() != this.ciudadFinal.getNumeroCiudad()) {
                Lista ciudadesCandidatas = ciudadesCandidatas(hormiga);
                if (ciudadesCandidatas.getpFirst() != null) {
                    Lista probs = probabilidades(ciudadesCandidatas);
                    Arista arista = decidirCiudad(probs, ciudadesCandidatas);
                    hormiga.visitarCiudad(arista.getCiudadDestino().getNumeroCiudad(), arista.getDistancia());
                }else{
                    break;
                }
            }else{
                break;
            }
        }

        if (this.distanciaOptima == 0) {
            this.setDistanciaOptima(hormiga.getLongitud());
            this.setRecorridoOptimo(hormiga.getCiudadesRecorridas());
        } else {
            if (hormiga.getLongitud() < this.distanciaOptima && hormiga.getCiudadActual().getNumeroCiudad() == this.ciudadFinal.getNumeroCiudad()) {
                this.setRecorridoOptimo(hormiga.getCiudadesRecorridas());
                this.setDistanciaOptima(hormiga.getLongitud());
            }

        }

        this.incrementarFeromonas(hormiga);
    }
    
    

    public Lista ciudadesCandidatas(Hormiga hormiga) {

        Lista ciudadesCandidatas = new Lista();

        if (grafo.buscarVertice2(hormiga.getCiudadActual().getNumeroCiudad()) != null) {
            Lista ListAdy = grafo.buscarVertice2(hormiga.getCiudadActual().getNumeroCiudad()).getList_ady();
            for (int i = 0; i < ListAdy.getSize(); i++) {
                Arista aristaActual = (Arista) ListAdy.getValor(i);
                if (!hormiga.visitado(aristaActual.getCiudadDestino().getNumeroCiudad())) {
                    ciudadesCandidatas.insertarFinal(ListAdy.getValor(i));
                }
            }
            return ciudadesCandidatas;
        } else {
            return null;
        }
    }

    public Lista probabilidades(Lista ciudadesCandidatas) {
        Lista probsindividir = new Lista();

        Lista ciudadesProbabilidades = new Lista();

        double sumatoria = 0;

        for (int i = 0; i < ciudadesCandidatas.getSize(); i++) {
            Arista arista = (Arista) ciudadesCandidatas.getValor(i);

            double probabilidad = Math.pow(arista.getFeromonas(), this.a) * Math.pow(1 / arista.getDistancia(), this.b);
            probsindividir.insertarFinal(probabilidad);
            sumatoria += probabilidad;
        }

        for (int i = 0; i < probsindividir.getSize(); i++) {
            double probabilidadCiudad = ((double) probsindividir.getValor(i)) / sumatoria;
            ciudadesProbabilidades.insertarFinal(probabilidadCiudad);
        }

        return ciudadesProbabilidades;
    }

    public Arista decidirCiudad(Lista probabilidades, Lista ciudadesCandidatas) {
        Lista index = new Lista();
        double probMayor = 0.0;

        for (int i = 0; i < probabilidades.getSize(); i++) {
            double probActual =  (double) probabilidades.getValor(i);
            if (probActual > probMayor || probActual == probMayor) {
                probMayor = probActual;
                index.insertarFinal(i);
            }
        }
        Random randomNumbers = new Random();
        int indexArista = randomNumbers.nextInt(index.getSize());
        
        Arista aristaFinal = (Arista) ciudadesCandidatas.getValor(indexArista);
        return aristaFinal;
    }

    
    //Reinicia el estado de todas las hormigas al inicio del recorrido.
    public void reiniciarHormigas() {
        for (int i = 0; i < this.hormigas.getSize(); i++) {
            Hormiga hormigaActual = (Hormiga) this.hormigas.getValor(i);
            hormigaActual.setCiudadActual(this.getCiudadInicial());
            hormigaActual.setLongitud(0);
            hormigaActual.getCiudadesRecorridas().vaciar();;

        }
    }

    
    //Evapora las feromonas en todas las aristas del grafo.
    public void evaporacionFeromonas() {
        // arista verificar si destino > origen
        for (int i = 0; i < grafo.getListaCiudades().getSize(); i++) {
            Vertice ciudadActual = (Vertice) grafo.getListaCiudades().getValor(i);
            for (int j = 0; j < ciudadActual.getList_ady().getSize(); j++) {
                Arista aristaActual = (Arista) ciudadActual.getList_ady().getValor(j);
                if (ciudadActual.getNumeroCiudad()< aristaActual.getCiudadDestino().getNumeroCiudad()) {
                    double newFeromonas = (1.0 - this.r) * aristaActual.getFeromonas();
                    aristaActual.setFeromonas(newFeromonas);
                }
            }
        }
    }

    
    //Incrementa las feromonas en las aristas recorridas por la hormiga.
    public void incrementarFeromonas(Hormiga hormiga) {
        double visibilidad = (double) q / hormiga.getLongitud();

        for (int i = 0; i < hormiga.getCiudadesRecorridas().getSize() - 1; i++) {
            Vertice ciudadActual = (Vertice) hormiga.getCiudadesRecorridas().getValor(i);
            Vertice siguienteCiudad = (Vertice) hormiga.getCiudadesRecorridas().getValor(i + 1);

            double totalFeromonas = visibilidad + ciudadActual.buscarArista2(siguienteCiudad.getNumeroCiudad()).getFeromonas();
            ciudadActual.buscarArista2(siguienteCiudad.getNumeroCiudad()).setFeromonas(totalFeromonas);
        }
    }

    //Se encarga de pasar el historial de lista a string
    public String toStringHistorial(){
        String historialCompleto = "";
        for (int i = 0; i <this.historial.getSize(); i++) {
            Historial historial = (Historial) this.historial.getValor(i);
            historialCompleto += historial.toString() + ("\n");
                
        }
        return historialCompleto;
    }
      
    
    public StringBuilder reco (){
        StringBuilder caminoOptimo = new StringBuilder("Camino óptimo: ");
        for (int i = 0; i < recorridoOptimo.getSize(); i++) {
            Vertice ciudad = (Vertice) recorridoOptimo.getValor(i);
            caminoOptimo.append(ciudad.getNumeroCiudad()); // O podrías usar otro identificador de la ciudad, dependiendo de cómo estén definidos tus vértices
            if (i < recorridoOptimo.getSize() - 1) {
                caminoOptimo.append(" -> ");
           
            }
         }
        return caminoOptimo;
    }
            
}