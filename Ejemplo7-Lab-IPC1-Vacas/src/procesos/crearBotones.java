/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import java.awt.Color;
import static java.lang.Math.random;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import tablero.utiles;

/**
 *
 * @author elmer
 */
public class crearBotones implements Runnable {

    int fila;
    int ancho;
    int alto;
    Color color;
    JPanel panelPrincipal;
    String direccion;
    int velocidad;

    public crearBotones(int fila, int ancho, int alto, Color color, JPanel panelPrincipal, String direccion, int velocidad) {
        this.fila = fila;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        this.panelPrincipal = panelPrincipal;
        this.direccion = direccion;
        this.velocidad = velocidad;
    }

    @Override
    public void run() {
        while (true) {
            Random random = new Random();
            int randomInteger = random.nextInt(7 - 1) + 1;

            JButton boton2;
            moverBoton proceso1;
            switch (this.direccion) {
                case "IZQUIERDA":
                    boton2 = utiles.CrearBotones(utiles.rutaImagenAuto1, this.ancho, this.alto, 800, 50 * randomInteger, this.color);
                    proceso1 = new moverBoton(boton2, this.velocidad, "IZQUIERDA", this.ancho);
                    break;
                case "DERECHA":
                    boton2 = utiles.CrearBotones(utiles.rutaImagenAuto2, this.ancho, this.alto, 0, 50 * randomInteger, this.color);
                    proceso1 = new moverBoton(boton2, this.velocidad, "DERECHA", this.ancho);
                    break;
                default:
                    boton2 = null;
                    proceso1 = null;
                    break;
            }
            this.panelPrincipal.add(boton2);
            Thread hilo1 = new Thread(proceso1);
            hilo1.start();
            if (utiles.vidas == 0) {
                return;
            }
            try {
                Thread.sleep(2000 * this.velocidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(moverBoton.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
