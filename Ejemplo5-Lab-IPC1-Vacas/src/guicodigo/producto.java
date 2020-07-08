/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicodigo;

/**
 *
 * @author elmer
 */
public class producto {

    private String nombre="";
    private double valor=0.0;

    public producto(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = Double.parseDouble(valor);
    }

    public producto() {
        this.nombre = "";
        this.valor = 0;
    }

    public void imprimir() {
        System.out.println("Nombre " + this.getNombre() + ", Valor " + this.getValor());
    }
    
    public String resumen(){
    //    return this.getNombre()+"("+this.getValor()+")";
        return this.getNombre();
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString(){
        return this.nombre+" ("+this.valor+")";
    }
    
}
