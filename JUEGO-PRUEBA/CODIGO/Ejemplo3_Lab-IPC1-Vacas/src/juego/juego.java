/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import javax.swing.JOptionPane;

/**
 *
 * @author elmer
 */
public class juego {

    private int filas;
    private int columnas;
    private String[][] tablero;
    private String[][] tableroInterno;
    private int vidas = 3;
    private int fichas = 0;
    private int posY = 0;
    private int posX = 0;
    private String nickname = "";

    public juego(int filas, int columnas, String[][] tablero, String[][] tableroInterno,String nickname) {
        this.filas = filas;
        this.columnas = columnas;
        this.tablero = tablero;
        this.tableroInterno = tableroInterno;
        this.nickname = nickname;
        logica();
    }

    public void logica() {
        int bandera = 0;
        while (bandera == 0) {
            System.out.println("Vidas " + this.vidas);
            System.out.println("Fichas " + this.fichas);
            utiles.imprimirMatriz(tablero, filas, columnas);
            String s = utiles.leerDeConsola();
            System.out.println("Tu opcion es... " + s);
            switch (s) {
                case "a":
                    moverHorizontal("IZQUIERDA");
                    break;
                case "w":
                    moverVertical("ARRIBA");
                    break;
                case "s":
                    moverVertical("ABAJO");
                    break;
                case "d":
                    moverHorizontal("DERECHA");
                    break;
                case "x":
                    System.out.println("Adios");
                    bandera = 1;
                    break;
                default:
                    System.out.println("Segui instrucciones!");
                    break;
            }
                if(validarMeta()) return;
                if(!tengoVidas()) return;
        }
    }

    public void moverHorizontal(String direccion) {
        this.tablero[this.posY][this.posX] = " ";
        int posAux = this.posX;

        switch (direccion) {
            case "IZQUIERDA":
                this.posX -= 1;
                break;
            case "DERECHA":
                this.posX += 1;
                break;
        }
        if (this.posX < 0 || this.posX >= this.columnas) {
            System.out.println("Te estas saliendo del tablero");
            this.posX = posAux;
        }
        validarObstaculo();
        this.tablero[this.posY][this.posX] = "@";

    }

    public void moverVertical(String direccion) {

        this.tablero[this.posY][this.posX] = " ";
        int posAux = this.posY;

        switch (direccion) {
            case "ARRIBA":
                this.posY--;
                break;
            case "ABAJO":
                this.posY++;
                break;
        }
        if (this.posY < 0 || this.posY >= this.filas) {
            System.out.println("Te estas saliendo del tablero");
            this.posY = posAux;
        }
        validarObstaculo();
        this.tablero[this.posY][this.posX] = "@";

    }

    public void validarObstaculo() {
        switch (tableroInterno[this.posY][this.posX]) {
            case "X"://obstaculo
                System.out.println("Obstaculo encontrado");
                this.vidas--;
                break;
            case "O"://Meta
                System.out.println("Ganaste una ficha");
                this.fichas++;
                break;
            default:
                break;
        }
    }

    public boolean validarMeta() {
        switch (tableroInterno[this.posY][this.posX]) {
            case "#"://obstaculo
                System.out.println("Fecilidades ya ganaste ["+this.nickname+"]");
                jugador jugadorNuevo = new jugador(this.nickname, this.vidas, this.fichas);
                jugadorNuevo.imprimir();
                utiles.agregarJugador(jugadorNuevo);
                return true;
            default:
                return false;
        }
    }
    
      public boolean tengoVidas() {
       if(this.vidas <=0){
           System.out.println("Te quedaste sin vidas");
           return false;
       }else{
           return true;
       }
    }

}
