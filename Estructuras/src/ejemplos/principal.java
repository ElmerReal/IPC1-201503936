/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import ejemplos.listaSimple.listaSimple;
import ejemplos.listaSimple.nodo;

/**
 *
 * @author elmer
 */
public class principal {

    public principal() {
//        nodo ref1 = new nodo(1, 10);
//        ref1.imprimir();
//        ref1.ImprimirSiguiente();
//        nodo ref2 = new nodo(2, 11);
//        ref2.imprimir();
//        ref2.ImprimirSiguiente();
////-------------------------------------
//        ref1.setSiguiente(ref2);
//        ref1.ImprimirSiguiente();

        listaSimple l = new listaSimple();
        l.ingresarNodo(new nodo(1, 10));
        l.ingresarNodo(new nodo(2, 11));
        l.ingresarNodo(new nodo(3, 12));
        l.ingresarNodo(new nodo(4, 13));
        l.ingresarNodo(new nodo(5, 14));
        l.imprimirLista();

        l.elminarNodo(2);
        l.imprimirLista();

        l.elminarNodo_por_valor(13);
        l.imprimirLista();
    }

}
