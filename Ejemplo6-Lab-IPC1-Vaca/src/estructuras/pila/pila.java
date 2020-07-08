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
public class pila {

    public int contador = 0;
    public elemento ultimo;

    public void push(elemento auxiliar) {
        auxiliar.setId(contador++);
        if (ultimo == null) {
            ultimo = auxiliar;
        } else {
            auxiliar.setAnterior(ultimo);
            ultimo = auxiliar;
        }
    }

    public void pop() {
        if (ultimo == null) {
            System.out.println("No podes sacar nada porque esta vacio");
        } else {
            ultimo.imprimir();
            ultimo = ultimo.getAnterior();
        }
    }

    public void imprimirPila() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        elemento temporal = ultimo;
        while (temporal != null) {
            temporal.imprimir();
            temporal = temporal.getAnterior();
        }
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
