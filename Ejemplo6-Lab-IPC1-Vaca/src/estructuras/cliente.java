/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author elmer
 */
public class cliente {
    public String nombre;
    public double montoCompra;

    public cliente(String nombre, double montoCompra) {
        this.nombre = nombre;
        this.montoCompra = montoCompra;
    }
    
    public void imprimir(){
        System.out.println("Mi nombre es "+this.nombre+", y gaste "+this.montoCompra);
    }
    
}
