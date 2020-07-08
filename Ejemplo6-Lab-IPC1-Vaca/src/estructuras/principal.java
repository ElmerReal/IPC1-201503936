/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import estructuras.cola.cola;
import estructuras.cola.elementoCola;
import estructuras.doblementeEnlazada.listaDoblementeEnlazada;
import estructuras.listaCircular.listaCircular;
import estructuras.listaCircular.nodoCircular;
import estructuras.listaSimple.nodo;
import estructuras.listaSimple.listaSimple;
import java.util.ArrayList;
import estructuras.listasimple.*;
import estructuras.pila.elemento;
import estructuras.pila.pila;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author elmer
 */
public class principal {

    public principal() {
//        listaSimple lista = new listaSimple();
//        lista.agregarNodo(new nodo(1, "Valor ABC"));
//        lista.agregarNodo(new nodo(2, "Valor XZY"));
//        lista.agregarNodo(new nodo(3, "Valor MNO"));
//        lista.agregarNodo(new nodo(4, "Valor X1"));
//        lista.agregarNodo(new nodo(5, "Valor X2"));
//
//        System.out.println(lista.generarCodigoGraphviz());
//        lista.eliminarNodo(4);
//        System.out.println(lista.generarCodigoGraphviz());
//        lista.eliminarNodo(2);
//        System.out.println(lista.generarCodigoGraphviz());

//        listaDoblementeEnlazada listaDoble = new listaDoblementeEnlazada();
//        listaDoble.agregarNodo(new estructuras.doblementeEnlazada.nodo("X1"));
//        listaDoble.agregarNodo(new estructuras.doblementeEnlazada.nodo("X2"));
//        listaDoble.agregarNodo(new estructuras.doblementeEnlazada.nodo("X3"));
//        listaDoble.agregarNodo(new estructuras.doblementeEnlazada.nodo("X4"));
//       // listaDoble.imprimirLista();
//        listaDoble.visitarNodoIdaVuelta();
//      //  System.out.println(listaDoble.generarCodigoGraphviz());
//////        listaCircular lc = new listaCircular();
//////        lc.agregarNodo(new nodoCircular("X1"));
//////        lc.agregarNodo(new nodoCircular("X2"));
//////        lc.agregarNodo(new nodoCircular("X3"));
//////
//////        lc.imprimirLista();
//////        System.out.println(lc.generarCodigoGraphviz());;
//////        pila p = new pila();
//////        p.push(new elemento("A"));
//////        p.push(new elemento("B"));
//////        p.push(new elemento("C"));
//////        p.push(new elemento("D"));
//////        p.imprimirPila();
//////        p.pop();
//////        p.imprimirPila();
//////        p.pop();
//////        p.imprimirPila();
//////        p.pop();
//////        p.imprimirPila();
//////        p.pop();
//////        p.imprimirPila();
//////        p.pop();
//////        p.imprimirPila();
//////        p.pop();
//////        p.imprimirPila();
//////        p.pop();
//////        p.imprimirPila();
        cola c = new cola();
        c.encolar(new elementoCola("Elmer"));
        c.encolar(new elementoCola("Orlando"));
        c.encolar(new elementoCola("Juan"));
        c.encolar(new elementoCola("Pedro"));
        
        escribirArchivo("C:\\IPC1\\REPORTE.HTML", c.imprimirHTML());
        c.imprimirCola();
        c.desencolar();
        c.imprimirCola();
        c.desencolar();
        c.imprimirCola();
        c.desencolar();
        c.imprimirCola();
        c.desencolar();
        c.imprimirCola();
        c.desencolar();
        c.imprimirCola();
        c.desencolar();
        c.imprimirCola();

    }
        public static void escribirArchivo(String ruta, String data) {
        File file = new File(ruta);
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
            fr.write(data + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
