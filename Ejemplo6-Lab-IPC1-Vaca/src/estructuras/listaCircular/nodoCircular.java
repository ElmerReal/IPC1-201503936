/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.listaCircular;

/**
 *
 * @author elmer
 */
public class nodoCircular {

    private int id;
    private String valor;
    private nodoCircular siguiente;

    public nodoCircular(String valor) {
        this.valor = valor;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the siguiente
     */
    public nodoCircular getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(nodoCircular siguiente) {
        this.siguiente = siguiente;
    }

    public void imprimirB() {
        System.out.println(this.valor);
    }

    public void imprimir() {
        System.out.println(this.valor + ", " + this + " >>> " + this.siguiente);
    }
}
