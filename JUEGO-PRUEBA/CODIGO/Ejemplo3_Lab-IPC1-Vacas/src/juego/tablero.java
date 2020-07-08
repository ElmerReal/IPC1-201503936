/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author elmer
 */
public class tablero {

    String[][] tablero;
    String[][] tableroInterno;
    int filas;
    int columnas;

    public tablero(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        tablero = new String[filas][columnas];
        tableroInterno = new String[filas][columnas];
        menuIniciarJuego();
    }

    public void menuIniciarJuego() {
        utiles.inicializarArreglas(tableroInterno, this.filas, this.columnas);
        tableroInterno[this.filas - 1][this.columnas - 1] = "#";
        menuTablero();
    }

    public tablero() {
        this.filas = 5;
        this.columnas = 5;
        tablero = new String[filas][columnas];
        tableroInterno = new String[filas][columnas];
        menuIniciarJuego();
    }

    public void menuTablero() {
        int bandera = 0;
        while (bandera == 0) {
            System.out.println(">>> Menu tablero <<<<");
            System.out.println("1) Ingresar obstaculo");
            System.out.println("2) Ingresar fichas");
            System.out.println("3) Jugar");
            System.out.println("4) Dimensiones tablero");
            System.out.println("5) Regresar al menu anterior");
            System.out.println("-> Seleccione una opcion");
            String s = utiles.leerDeConsola();
            System.out.println("Tu opcion es... " + s);
            switch (s) {
                case "1":
                    System.out.println(">> Ingrese el obstaculo de la forma {fila, columna}");
                    IngresarValorMatrizInterna("X");
                    break;
                case "2":
                    IngresarValorMatrizInterna("O");
                    break;
                case "3":
                    utiles.inicializarArreglas(tablero, this.filas, this.columnas);
                    tablero[0][0] = "@";
                    tablero[this.filas - 1][this.columnas - 1] = "#";
                    System.out.println("Ingresa tu nickname");
                    String nickname = utiles.leerDeConsola();
                    juego obj = new juego(this.filas, this.columnas, this.tablero, this.tableroInterno, nickname);
                    break;
                case "4":
                    System.out.println("Filas " + this.filas + " * Columnas " + this.columnas);
                    break;
                case "5":
                    bandera = 1;
                    break;
                default:
                    System.out.println("Segui instrucciones!");
                    break;
            }
            utiles.imprimirVacio();
        }
    }

    public void IngresarValorMatrizInterna(String valor) {
        String s1 = utiles.quitarInicioFin(utiles.leerDeConsola());
        int fila = utiles.partir(s1, 0);
        int columna = utiles.partir(s1, 1);
        if (fila >= this.filas && columna >= this.columnas) {
            System.out.println(">>No es posible por soy de " + this.filas + "x" + this.columnas);
            return;
        }
        System.out.println("Si es correcto");
        tableroInterno[fila][columna] = valor;
        utiles.imprimirMatriz(tableroInterno, this.filas, this.columnas);
        System.out.println("-----------");
        utiles.imprimirMatriz(tablero, this.filas, this.columnas);
    }

}
