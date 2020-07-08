/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.doblementeEnlazada;

/**
 *
 * @author elmer
 */
public class nodo {

    private int id;
    private String valor;
    private nodo siguiente;
    private nodo anterior;

    public nodo(String valor) {
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
    public nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public nodo getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(nodo anterior) {
        this.anterior = anterior;
    }

    public void imprimir() {
        System.out.println(this.anterior + " <<< " + this.valor + ", " + this + " >>> " + this.siguiente);
    }
    
    public void imprimirB() {
        System.out.println(this.valor);
    }

}
