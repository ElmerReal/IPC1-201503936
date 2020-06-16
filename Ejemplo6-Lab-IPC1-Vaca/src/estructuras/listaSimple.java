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
public class listaSimple {

    nodo primero;

    public void agregarNodo(nodo nodoAuxiliar) {
        if (this.primero == null) {
            primero = nodoAuxiliar;
        } else {
            nodo temporal = primero;
            while (temporal.getSiguiente() != null) {
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(nodoAuxiliar);
        }
    }

    public void eliminarNodo(int identificador) {
        nodo temporal = primero;
        while (temporal != null) {
            if(temporal.getSiguiente() != null){
                if(temporal.getSiguiente().getIdentificaro() == identificador){
                    nodo temporalSiguiente = temporal.getSiguiente();
                    temporal.setSiguiente(temporalSiguiente.getSiguiente());
                    return;
                }
            }
            temporal.imprimir();
            temporal = temporal.getSiguiente();
        }
        System.out.println("No existe ese nodo.");
    }

    public void imprimirLista() {
        System.out.println("----------------------------------------->>");
        nodo temporal = primero;
        while (temporal != null) {
            temporal.imprimir();
            temporal = temporal.getSiguiente();
        }
    }

}
