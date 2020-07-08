/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author elmer
 */
public class repuesto {
    private String nombre = "";
    private double valor = 0.00;

    public repuesto(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = Double.parseDouble(valor);
    }

    public repuesto() {
        this.nombre = "";
        this.valor = 0;
    }
    public void imprimir(){
        System.out.println("Nombre "+this.nombre+", Valor "+this.valor);
    }
    
    
}
