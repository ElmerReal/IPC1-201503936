/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.ArrayList;

/**
 *
 * @author elmer
 */
public class principal {

//    cliente[] listaClientes = new cliente[50000];
//    ArrayList listaClientes1 = new ArrayList<cliente>();
    public principal() {
        listaSimple lista = new listaSimple();
        lista.agregarNodo(new nodo(1, "Valor ABC"));
        lista.agregarNodo(new nodo(2, "Valor XZY"));
        lista.agregarNodo(new nodo(3, "Valor MNO"));
        lista.imprimirLista();
        lista.eliminarNodo(2);
        lista.imprimirLista();
//        nodo cabeza = new nodo(1, "Valor ABC");
//        cabeza.imprimir();
//        cabeza.imprimirSiguiente();
//        
//        nodo proximo = new nodo(2, "Soy el nodo proximo");
//        proximo.imprimir();
//        proximo.imprimirSiguiente();
//        
//        nodo tercero = new nodo(3, "Soy el tercero");
//        tercero.imprimir();
//        tercero.imprimirSiguiente();
//        
//        System.out.println("---------------------------");
//        cabeza.setSiguiente(proximo);
//        cabeza.imprimirSiguiente();
    }
}
