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
public class principal {
    
    public principal() {
      utiles.inicializarArregloJugadores();
        int bandera = 0;
        while (bandera == 0) {
            System.out.println(">>> Bienvenido <<<<");
            System.out.println("1) Ir al juego");
            System.out.println("2) Ver reporte");
            System.out.println("3) Salir");
            System.out.println("-> Seleccione una opcion");
            String s = utiles.leerDeConsola();
            System.out.println("Tu opcion es... " + s);
            switch(s){
                case "1":
                    tablero obj = new tablero();
                    break;
                case "2":
                   utiles.burbuja();
                    break;
                case "3":
                    bandera=1;
                    break;
                default:
                    System.out.println("Segui instrucciones!");
                    break;
            }
            utiles.imprimirVacio();
        }
    }

}
