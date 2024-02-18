/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Grafo;
import EDD.Lista;

/**
 *
 * @author nicolepinto
 */
public class SistemaHormiga {
    private double feromonas ;
    
    
    
    public double inicializarFeromonas(Grafo grafo) {
        // Inicializar la variable feromonas
        setFeromonas(0.0);
        int numCiudades = grafo.getCiudadesNumero();
        double feromonas = 1 / numCiudades; // Calcular la cantidad inicial de feromonas
        return feromonas;
    }
    
    
    

    /**
     * @return the feromonas
     */
    public double getFeromonas() {
        return feromonas;
    }

    /**
     * @param feromonas the feromonas to set
     */
    public void setFeromonas(double feromonas) {
        this.feromonas = feromonas;
    }
    
    
    
        
        
    
}
  
  
