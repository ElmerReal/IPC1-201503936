/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_ortogonal;

import clases.persona;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author elmerreal
 */
public class matriz {

    public static int contadorNodos = 0;
    public nodo NodoPrincipal = new nodo();

    public nodo existeFila(nodo cabeza, String nacionalidad) {
        nodo nodoTemporal = cabeza.getAbajo();
        while (nodoTemporal != null) {
            if (nodoTemporal.getNacionalidad().equals(nacionalidad)) {
                return nodoTemporal;
            }
            nodoTemporal = nodoTemporal.getAbajo();
        }
        return null;
    }

    public nodo existeColumna(nodo cabeza, int edad) {
        nodo nodoTemporal = cabeza.getDerecha();
        while (nodoTemporal != null) {
            if (nodoTemporal.getEdad() == edad) {
                return nodoTemporal;
            }
            nodoTemporal = nodoTemporal.getDerecha();
        }
        return null;

    }

    public nodo insertarFila(nodo cabeza, String nacionalidad) {
        nodo nodoTemporal = cabeza;
        while (nodoTemporal.getAbajo() != null) {
            nodoTemporal = nodoTemporal.getAbajo();
        }
        nodo nuevoNodo = new nodo();
        nuevoNodo.setNacionalidad(nacionalidad);
        nuevoNodo.setArriba(nodoTemporal);
        nodoTemporal.setAbajo(nuevoNodo);
        return nuevoNodo;
    }

    public nodo insertarColumna(nodo cabeza, int edad) {
        nodo nodoTemporal = cabeza;
        while (nodoTemporal.getDerecha() != null) {
            nodoTemporal = nodoTemporal.getDerecha();
        }
        nodo nuevoNodo = new nodo();
        nuevoNodo.setEdad(edad);
        nuevoNodo.setIzquierda(nodoTemporal);
        nodoTemporal.setDerecha(nuevoNodo);
        return nuevoNodo;
    }

    public void insertarValor(String nacionalidad, int edad, String nombre, String dpi) {
        System.out.println(nacionalidad);
        //Averiguar si existe cabecera nacionalidad o crearla
        nodo nodoCabeceraNac = this.existeFila(this.NodoPrincipal, nacionalidad);
        if (nodoCabeceraNac == null) {
            nodoCabeceraNac = this.insertarFila(this.NodoPrincipal, nacionalidad);
        }
        //Averiguar si existe cabecera edad o crearla.
        nodo nodoCabeceraEdad = this.existeColumna(this.NodoPrincipal, edad);
        if (nodoCabeceraEdad == null) {
            nodoCabeceraEdad = this.insertarColumna(this.NodoPrincipal, edad);
        }

        nodo nodoCeldadEdadEnNacionalidad = this.existeColumna(nodoCabeceraNac, edad);
        if (nodoCeldadEdadEnNacionalidad == null) {
            nodoCeldadEdadEnNacionalidad = this.insertarColumna(nodoCabeceraNac, edad);
            nodoCeldadEdadEnNacionalidad.setNacionalidad(nacionalidad);
            nodoCeldadEdadEnNacionalidad.setValor(new persona(edad, nacionalidad, nombre, dpi));

            nodo nodoTemporalNacionalidadEdad = nodoCabeceraEdad;
            while (nodoTemporalNacionalidadEdad.getAbajo() != null) {
                nodoTemporalNacionalidadEdad = nodoTemporalNacionalidadEdad.getAbajo();
            }
            nodoTemporalNacionalidadEdad.setAbajo(nodoCeldadEdadEnNacionalidad);
            nodoCeldadEdadEnNacionalidad.setArriba(nodoTemporalNacionalidadEdad);
        }

    }

    public void imprimirGraphviz() {
        nodo nodoTemporal = this.NodoPrincipal.getAbajo();
        System.out.println("digraph {");
        System.out.println("node [shape=box]");
        System.out.println(this.NodoPrincipal.getId() + "[label=\"Nodo Principal\"]");

        //imprimir cabecera edad
        nodo nodoTemporalEdad = this.NodoPrincipal.getDerecha();
        String nivelCabeceraEdad = "{ rank = same;" + this.NodoPrincipal.getId() + ";";
        while (nodoTemporalEdad != null) {
            System.out.println(nodoTemporalEdad.getId() + "[label=\"" + nodoTemporalEdad.getEdad() + "\"]");
            System.out.println(nodoTemporalEdad.getIzquierda().getId() + "->" + nodoTemporalEdad.getId());
            System.out.println(nodoTemporalEdad.getId() + "->" + nodoTemporalEdad.getIzquierda().getId());
            nivelCabeceraEdad += nodoTemporalEdad.getId() + ";";
            nodoTemporalEdad = nodoTemporalEdad.getDerecha();
        }
        nivelCabeceraEdad += "}";
        System.out.println(nivelCabeceraEdad);

        //Imprimr cabeceras nacionalidad
        while (nodoTemporal != null) {
            System.out.println(nodoTemporal.getId() + "[label=\"" + nodoTemporal.getNacionalidad() + "\"]");
            System.out.println(nodoTemporal.getArriba().getId() + "->" + nodoTemporal.getId() + ";");
            System.out.println(nodoTemporal.getId() + "->" + nodoTemporal.getArriba().getId() + ";");
            String nivelMismaNacionalidad = "{ rank = same;" + nodoTemporal.getId() + ";";
            nodo nodoColumnas = nodoTemporal.getDerecha();
            while (nodoColumnas != null) {
                System.out.println(nodoColumnas.getId() + " [label=\"" + nodoColumnas.getValor().imprimir() + "\",group=" + nodoColumnas.getEdad() + "]");
                System.out.println(nodoColumnas.getIzquierda().getId() + "->" + nodoColumnas.getId() + ";");
                System.out.println(nodoColumnas.getId() + "->" + nodoColumnas.getIzquierda().getId() + ";");
                System.out.println(nodoColumnas.getArriba().getId() + "->" + nodoColumnas.getId() + ";");
                System.out.println(nodoColumnas.getId() + "->" + nodoColumnas.getArriba().getId() + ";");
                nivelMismaNacionalidad += nodoColumnas.getId() + ";";
                nodoColumnas = nodoColumnas.getDerecha();
            }
            nivelMismaNacionalidad += "}";
            System.out.println(nivelMismaNacionalidad);
            nodoTemporal = nodoTemporal.getAbajo();
        }

        System.out.println("}");
    }

    public void ejecutarComando() {
      
    }

}
