/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import java.awt.Color;
import java.awt.geom.Area;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import tablero.utiles;

/**
 *
 * @author elmer
 */
public class moverBoton implements Runnable {

    JButton boton;
    int velocidad;
    String direccion;
    int ancho;

    public moverBoton(JButton boton, int velocidad, String direccion, int ancho) {
        this.boton = boton;
        this.velocidad = velocidad;
        this.direccion = direccion;
        this.ancho = ancho;
    }

    @Override
    public void run() {

        while (true) {
            switch (this.direccion) {
                case "IZQUIERDA":
                    boton.setBounds(boton.getX() - 1, boton.getY(), boton.getWidth(), boton.getHeight());
                    break;
                case "DERECHA":
                    boton.setBounds(boton.getX() + 1, boton.getY(), boton.getWidth(), boton.getHeight());
                    break;
            }
            Area areaA = new Area(tablero.tablero.boton1.getBounds());
            Area areaB = new Area(this.boton.getBounds());
            if (areaA.intersects(areaB.getBounds2D())) {
                System.out.println("Coliion con color " + this.boton.getBackground().toString());
                this.boton.setBackground(Color.WHITE);
                utiles.vidas--;
                this.boton.setVisible(false);
                return;
            }

//            if (tablero.tablero.boton1.getX() == this.boton.getX() && tablero.tablero.boton1.getY() == this.boton.getY()) {
//                System.out.println("Coliion con color " + this.boton.getBackground().toString());
//                this.boton.setBackground(Color.WHITE);
//                utiles.vidas--;
//            }
            if (utiles.vidas == 0) {
                return;
            }

            try {
                Thread.sleep(20 * velocidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(moverBoton.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
