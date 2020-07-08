/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplo9.lab.ipc1.vacas;

/**
 *
 * @author elmerreal
 */
public class persona {
    public String nombre;
    public String nacionalidad;

    public persona(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    public void imprimir(){
        System.out.println("Soy "+this.nombre+", vengo de "+this.nacionalidad);
    }
    
    
}
