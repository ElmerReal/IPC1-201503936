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
public class listaSimple {

    nodo cabeza;

    public void ingresarNodo(nodo auxiliar) {
        if (this.cabeza == null) {
            this.cabeza = auxiliar;
        } else {
            nodo temporal = cabeza;
            while (temporal.getSiguiente() != null) {
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(auxiliar);
        }
    }

    public void elminarNodo(int id) {
        if (this.cabeza == null) {
            System.out.println("No hay nada que eliminar");
        } else {
            if (this.cabeza.getId() == id) {
                this.cabeza = this.cabeza.getSiguiente();
            } else {
                nodo temporal = cabeza;

                while (temporal != null) {
                    if (temporal.getSiguiente() != null) {
                        if (temporal.getSiguiente().getId() == id) {
                            System.out.println("Te encontre " + id);
                            nodo tempoSiguiente = temporal.getSiguiente();
                            temporal.setSiguiente(tempoSiguiente.getSiguiente());
                            tempoSiguiente.setSiguiente(null);
                            return;
                        }
                    }
                    temporal = temporal.getSiguiente();
                }
            }
            System.out.println("No existe el valor que estas buscando");
        }
    }

    public void elminarNodo_por_valor(int valor) {
        if (this.cabeza == null) {
            System.out.println("No hay nada que eliminar");
        } else {
            nodo temporal = cabeza;
            while (temporal != null) {
                if (temporal.getSiguiente() != null) {
                    if (temporal.getSiguiente().getValor() == valor) {
                        System.out.println("Te encontre " + valor);
                        nodo tempoSiguiente = temporal.getSiguiente();
                        temporal.setSiguiente(tempoSiguiente.getSiguiente());

                        tempoSiguiente.setSiguiente(null);

                        return;
                    }
                }
                temporal = temporal.getSiguiente();
            }
            System.out.println("No existe el valor que estas buscando");
        }
    }

    public void imprimirLista() {
        System.out.println(">>>>>>>>. Lista simple <<<<<<<<<<<");
        nodo temporal = cabeza;
        while (temporal != null) {
            temporal.imprimir();
            temporal = temporal.getSiguiente();
        }
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

}
