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
public class nodo {
    private int identificaro;
    private String valor;
    private nodo siguiente;

    public nodo(int identificaro, String valor) {
        this.identificaro = identificaro;
        this.valor = valor;
    }
    
    public void imprimir(){
        System.out.println(this.identificaro+", "+this.valor);
    }

    /**
     * @return the identificaro
     */
    public int getIdentificaro() {
        return identificaro;
    }

    /**
     * @param identificaro the identificaro to set
     */
    public void setIdentificaro(int identificaro) {
        this.identificaro = identificaro;
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
    
    public void imprimirSiguiente(){
        if(this.siguiente == null){
            System.out.println("No tenes siguiente");
        }else{
            this.siguiente.imprimir();
        }
    }
    
    
    
}
