/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplo8.lab.ipc1.vacas;

import clases.persona;
import java.util.ArrayList;
import matriz_ortogonal.matriz;

/**
 *
 * @author elmerreal
 */
public class ejemplo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //persona[][] matriz = new persona[5][5];
        matriz mat = new matriz();
        mat.insertarValor("GT", 5, "Maria", "GT-Maria-5");
        mat.insertarValor("GT", 40, "Juan", "GT-Juan-40");
        mat.insertarValor("MX", 40, "Coco", "MX-Coco-40");
        mat.insertarValor("MX", 20, "Pedro", "MX-Pedro-20");
        mat.insertarValor("CR", 5, "Messi", "CR-Messi-5");
        mat.imprimirGraphviz();
    }
    
}
