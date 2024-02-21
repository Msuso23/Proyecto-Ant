/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import Clases.Hormiga;
import EDD.Arista;
import EDD.Grafo;
import EDD.Lista;
import EDD.Vertice;

/**
 *
 * @author nicolepinto
 */
public class FuncionesSistemaHormiga {
    
    
    public Lista inicializarHormigas(int numeroHormigas, Vertice ciudadInicio){
        Lista hormigas = new Lista();
        for (int i = 0; i < numeroHormigas; i++) {
            Hormiga hormiga = new Hormiga();
            hormiga.setCiudadActual(ciudadInicio);
            hormigas.insertarFinal(hormiga);
        }
        return hormigas;
    }
    
   
    
    public void inicializarFeromonas(Grafo grafo){
    
    double feromonasIniciales = 1/grafo.getListaCiudades().getSize();
        for (int i = 0; i < grafo.getListaCiudades().getSize(); i++) {
            Vertice ciudadActual = (Vertice) grafo.getListaCiudades().getValor(i);
            for (int j = 0; j < ciudadActual.getList_ady().getSize(); j++) {
                Arista arista = (Arista) ciudadActual.getList_ady().getValor(j);
                arista.setFeromonas(feromonasIniciales);
            }
        }
    }  
}

