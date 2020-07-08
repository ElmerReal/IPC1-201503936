/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.pila;

/**
 *
 * @author elmer
 */
public class elemento {
    private int id;
    private String valor;
    private elemento anterior;

    public elemento(String valor) {
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
     * @return the anterior
     */
    public elemento getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(elemento anterior) {
        this.anterior = anterior;
    }
    
    public void imprimir(){
        System.out.println(this.valor);
    }
}
