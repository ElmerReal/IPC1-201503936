/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Scanner;

/**
 *
 * @author elmer
 */
public class utiles {

    public static jugador[] arregloJugadores = new jugador[5];

    public static void inicializarArregloJugadores() {
        for (int i = 0; i < arregloJugadores.length; i++) {
            jugador obj = new jugador();
            arregloJugadores[i] = obj;
        }
    }

    public static void agregarJugador(jugador jugadorNuevo) {
        for (int i = 0; i < arregloJugadores.length; i++) {
            if (arregloJugadores[i].getMonedas() == 0) {
                arregloJugadores[i] = jugadorNuevo;
                break;
            }
        }

    }
    
    public  static void burbuja()
    {
        jugador arreglo[] = arregloJugadores;
        for(int i = 0; i < arreglo.length - 1; i++)
        {
            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if (arreglo[j].getMonedas() < arreglo[j + 1].getMonedas())
                {
                    jugador tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
        for(int i = 0;i < arreglo.length; i++)
        {
           arreglo[i].imprimir();
        }
    }

    public static void imprimirArregloJugadores() {
        System.out.println(">>>>>>> El top 5 es ..... ");
        for (jugador obj : arregloJugadores) {
            obj.imprimir();
        }
    }

    public static void imprimirVacio() {
        //  System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("");
        System.out.println("Presiona una tecla para continuar");
        utiles.leerDeConsola();
        //   System.out.println("");
    }
//  H O L A 

    public static String quitarInicioFin(String cadena) {
        String aux = "";
        for (int i = 1; i < cadena.length() - 1; i++) {
            aux = aux + cadena.charAt(i);
        }
        return aux;
    }

    public static int partir(String cadena, int pos) {
        String[] aux = cadena.split(",");
        return Integer.parseInt(aux[pos]);
    }

    public static String leerDeConsola() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }

    public static void imprimirMatriz(String[][] matriz, int fila, int columna) {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(" |" + matriz[i][j]);
            }
            System.out.println("");
        }
    }

    public static void inicializarArreglas(String[][] matriz, int fila, int columna) {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriz[i][j] = " ";
            }
        }
    }
}
