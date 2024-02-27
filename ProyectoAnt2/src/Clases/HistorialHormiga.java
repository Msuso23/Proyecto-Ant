/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class HistorialHormiga {
    private int numHormiga;
    private String caminoRecorrido;
    private String longitudRecorrido;

    public HistorialHormiga(int numHormiga, String caminoRecorrido, String longitudRecorrido) {
        this.numHormiga = numHormiga;
        this.caminoRecorrido = caminoRecorrido;
        this.longitudRecorrido = longitudRecorrido;
    }

    public int getNumHormiga() {
        return numHormiga;
    }

    public void setNumHormiga(int numHormiga) {
        this.numHormiga = numHormiga;
    }

    public String getCaminoRecorrido() {
        return caminoRecorrido;
    }

    public void setCaminoRecorrido(String caminoRecorrido) {
        this.caminoRecorrido = caminoRecorrido;
    }

    public String getLongitudRecorrido() {
        return longitudRecorrido;
    }

    public void setLongitudRecorrido(String longitudRecorrido) {
        this.longitudRecorrido = longitudRecorrido;
    }
    
    public String toStringP() {
        return "numHormiga:" + numHormiga + ", camino Recorrido: " + caminoRecorrido + ", longitud Recorrida=" + longitudRecorrido;
    }
    
}

