/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;



/**
 *
 * @author Camila Garcia
 */
public class Ciudades {
    private Object num;
    private Lista hormigas;
    
    
    //Constructor
    public Ciudades(Object num, Lista hormigas) {
        this.num = num;
        this.hormigas = hormigas;
    }
    
    public Ciudades(Object num) {
        this.num = num;
    }


    //Getters y Setters
    public Object getNum() {
        return num;
    }

    public void setNum(Object num) {
        this.num = num;
    }

    public Lista getHormigas() {
        return hormigas;
    }

    public void setHormigas(Lista hormigas) {
        this.hormigas = hormigas;
    } 
    
}
