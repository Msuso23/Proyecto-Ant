/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author nicolepinto
 */
public class Vertice {
    
    private int NumeroCiudad;
    public Lista list_ady;

    public Vertice(int NumeroCiudad, Lista list_ady) {
        this.NumeroCiudad = NumeroCiudad;
        this.list_ady = list_ady;
    }

    public int getNumeroCiudad() {
        return NumeroCiudad;
    }

    public void setNumeroCiudad(int NumeroCiudad) {
        this.NumeroCiudad = NumeroCiudad;
    }

    public Lista getList_ady() {
        return list_ady;
    }

    public void setList_ady(Lista list_ady) {
        this.list_ady = list_ady;
    }


    //Agregsr arista y eliminar
    public void agregar(){
    
    }
}
