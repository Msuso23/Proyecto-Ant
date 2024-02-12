/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Lista;

/**
 *
 * @author nicolepinto
 */
public class Ant {
    
    private Lista CiudadesVisitadas;
    private int caminoRecorrido;

    public Ant(Lista CiudadesVisitadas, int caminoRecorrido) {
        this.CiudadesVisitadas = CiudadesVisitadas;
        this.caminoRecorrido = caminoRecorrido;
    }

    public Lista getCiudadesVisitadas() {
        return CiudadesVisitadas;
    }

    public void setCiudadesVisitadas(Lista CiudadesVisitadas) {
        this.CiudadesVisitadas = CiudadesVisitadas;
    }

    public int getCaminoRecorrido() {
        return caminoRecorrido;
    }

    public void setCaminoRecorrido(int caminoRecorrido) {
        this.caminoRecorrido = caminoRecorrido;
    }
    
    //Primitiva 
}
