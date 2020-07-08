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
public class clasePrueba2 {
    
   public static int valor = 80;

    public clasePrueba2() {
        int val1 = 50;
        metodo1(val1);
        System.out.println(val1);

        persona p1 = new persona("Elmer Real", "Guatemalteco");
        metodo2(p1);
        p1.imprimir();
    }

    public void metodo1(int valor) {
        valor = 80;
    }

    public void metodo2(persona p1) {
        p1 = new persona("Juan", "mexico");
        p1.nacionalidad = "Aleman";
        p1.imprimir();
        
    }

}
