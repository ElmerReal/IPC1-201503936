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
public class listaCircular {

    nodoCircular primero;
    int contador = 0;

    public void agregarNodo(nodoCircular nodoAuxiliar) {
        nodoAuxiliar.setId(contador++);
        if (this.primero == null) {
            this.primero = nodoAuxiliar;
            this.primero.setSiguiente(primero);
        } else {
            nodoCircular temporal = primero;
            while (temporal.getSiguiente() != primero) {
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(nodoAuxiliar);
            nodoAuxiliar.setSiguiente(primero);
        }
    }

    public String generarCodigoGraphviz() {
        String cadena = "digraph G {";
        nodoCircular temporal = primero;
        if (temporal != null) {
            do {
                cadena += temporal.getId() + " [label=\"" + temporal.getValor() + "\"];\n";
                if (temporal.getSiguiente() != null) {
                    cadena += temporal.getId() + " -> " + temporal.getSiguiente().getId() + ";\n";
                }
                temporal = temporal.getSiguiente();
            } while (temporal != primero);
        }

//        while (temporal != null) {
//            cadena += temporal.getId() + " [label=\"" + temporal.getValor() + "\"];\n";
//            if (temporal.getAnterior() != null) {
//                cadena += temporal.getId() + " -> " + temporal.getAnterior().getId() + ";\n";
//            }
//
//            if (temporal.getSiguiente() != null) {
//                cadena += temporal.getId() + " -> " + temporal.getSiguiente().getId() + ";\n";
//            }
//            temporal = temporal.getSiguiente();
//        }
        cadena += "}\n";
        return cadena;
    }

    public void imprimirLista() {
        System.out.println("----------------------------------------->>");
        nodoCircular temporal = primero;
        if (temporal != null) {
            do {
                temporal.imprimir();
                temporal = temporal.getSiguiente();
            } while (temporal != primero);
        }
    }
}
