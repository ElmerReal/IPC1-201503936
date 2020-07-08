/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_ortogonal;

import clases.persona;

/**
 *
 * @author elmerreal
 */
public class nodo {

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
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the valor
     */
    public persona getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(persona valor) {
        this.valor = valor;
    }

    /**
     * @return the arriba
     */
    public nodo getArriba() {
        return arriba;
    }

    /**
     * @param arriba the arriba to set
     */
    public void setArriba(nodo arriba) {
        this.arriba = arriba;
    }

    /**
     * @return the abajo
     */
    public nodo getAbajo() {
        return abajo;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(nodo abajo) {
        this.abajo = abajo;
    }

    /**
     * @return the derecha
     */
    public nodo getDerecha() {
        return derecha;
    }

    /**
     * @param derecha the derecha to set
     */
    public void setDerecha(nodo derecha) {
        this.derecha = derecha;
    }

    /**
     * @return the izquierda
     */
    public nodo getIzquierda() {
        return izquierda;
    }

    /**
     * @param izquierda the izquierda to set
     */
    public void setIzquierda(nodo izquierda) {
        this.izquierda = izquierda;
    }
    private nodo arriba;
    private nodo abajo;
    private nodo derecha;
    private nodo izquierda;
    private String nacionalidad;
    private int edad;
    private persona valor;
    private int id;

    public nodo(String nacionalidad, int edad, persona valor) {
        this.id = matriz.contadorNodos++;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.valor = valor;
    }

    public nodo() {
        this.id = matriz.contadorNodos++;
        this.nacionalidad = "";
        this.edad = 0;
    }

    public void imprimir() {
        System.out.println("soy el nodo " + this.getId());
        System.out.println("Arriba " + this.arriba);
        System.out.println("Abajo " + this.abajo);
        System.out.println("Derecha " + this.derecha);
        System.out.println("Izquierda " + this.izquierda);
        if (this.valor != null) {
            this.valor.imprimir();
        }
    }

}
