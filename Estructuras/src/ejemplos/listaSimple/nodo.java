/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.listaSimple;

/**
 *
 * @author elmer
 */
public class nodo {
   private int id;
   private int valor;
   
   private nodo siguiente; 

    public nodo(int id, int valor) {
        this.id = id;
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
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
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
    
    public void imprimir(){
        System.out.println("ID "+this.id+", Valor "+this.valor);
    }
    
    public void ImprimirSiguiente(){
        if(this.siguiente == null){
            System.out.println("No hay siguiente");
        }else{
            System.out.println("El siguiente de "+this.id+">>>");
            this.siguiente.imprimir();
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        }
    }
    
}
