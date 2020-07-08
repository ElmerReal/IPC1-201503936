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
public class listaDoblementeEnlazada {

    int contador = 0;
    nodo primero;

    public void agregarNodo(nodo nodoAuxiliar) {
        nodoAuxiliar.setId(contador++);
        if (this.primero == null) {
            primero = nodoAuxiliar;
        } else {
            nodo temporal = primero;
            while (temporal.getSiguiente() != null) {
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(nodoAuxiliar);
            nodoAuxiliar.setAnterior(temporal);
        }
    }

    public void imprimirLista() {
        System.out.println("----------------------------------------->>");
        nodo temporal = primero;
        while (temporal != null) {
            temporal.imprimir();
            temporal = temporal.getSiguiente();
        }
    }

    public String generarCodigoGraphviz() {
        String cadena = "digraph G {";
        nodo temporal = primero;
        while (temporal != null) {
            cadena += temporal.getId() + " [label=\"" + temporal.getValor() + "\"];\n";
            if (temporal.getAnterior() != null) {
                cadena += temporal.getId() + " -> " + temporal.getAnterior().getId() + ";\n";
            }

            if (temporal.getSiguiente() != null) {
                cadena += temporal.getId() + " -> " + temporal.getSiguiente().getId() + ";\n";
            }
            temporal = temporal.getSiguiente();
        }
        cadena += "}\n";
        return cadena;
    }

    public void visitarNodoIdaVuelta() {
        nodo temporal = primero;
        System.out.println("IDA....");
        while (temporal.getSiguiente() != null) {
            temporal.imprimirB();
            temporal = temporal.getSiguiente();
        }
        temporal.imprimirB();
        System.out.println("Vuelta ...");
        while (temporal != null) {
            temporal.imprimirB();
            temporal = temporal.getAnterior();
        }
    }
}
