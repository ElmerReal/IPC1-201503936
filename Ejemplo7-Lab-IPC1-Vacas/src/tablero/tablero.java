/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import procesos.crearBotones;
import procesos.ganar_perder;
import procesos.moverBoton;
import procesos.movimientos;

/**
 *
 * @author elmer
 */
public class tablero extends JFrame {

    public static JButton boton1 = utiles.CrearBotones("Boton1", 100, 50, 300, 300, Color.BLACK);

    public tablero(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearObjetosInternos();
    }

    public void crearObjetosInternos() {
        JPanel panelPrincipal = utiles.CrearPaneles(800, 500, Color.BLUE);
        crearBotones hiloFila1 = new crearBotones(1, 100, 50, Color.RED, panelPrincipal, "DERECHA", 1);
        Thread hilo1 = new Thread(hiloFila1);
        hilo1.start();

//        crearBotones hiloFila2 = new crearBotones(2, 100, 50, Color.ORANGE, panelPrincipal, "IZQUIERDA", 1);
//        Thread hilo2 = new Thread(hiloFila2);
//        hilo2.start();
//
//        crearBotones hiloFila3 = new crearBotones(3, 100, 50, Color.DARK_GRAY, panelPrincipal, "DERECHA", 1);
//        Thread hilo3 = new Thread(hiloFila3);
//        hilo3.start();
//
//        crearBotones hiloFila4 = new crearBotones(4, 100, 50, Color.MAGENTA, panelPrincipal, "IZQUIERDA", 1);
//        Thread hilo4 = new Thread(hiloFila4);
//        hilo4.start();
//
//        crearBotones hiloFila5 = new crearBotones(5, 100, 50, Color.CYAN, panelPrincipal, "DERECHA", 1);
//        Thread hilo5 = new Thread(hiloFila5);
//        hilo5.start();
        
        ganar_perder hiloGanar = new ganar_perder();
        Thread hiloGanar1 = new Thread(hiloGanar);
        hiloGanar1.start();

        panelPrincipal.add(boton1);
        boton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Click");
            }
        });

        boton1.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("typed");
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case 37: //left
                        // JOptionPane.showMessageDialog(null, "Izquierda");
                        boton1.setBounds(boton1.getX() - 100, boton1.getY(), boton1.getWidth(), boton1.getHeight());
                        break;
                    case 38: // up
                        //  JOptionPane.showMessageDialog(null, "arriba");
                        boton1.setBounds(boton1.getX(), boton1.getY() - 50, boton1.getWidth(), boton1.getHeight());
                        break;

                    case 39://right
                        //  JOptionPane.showMessageDialog(null, "derecha");
                        boton1.setBounds(boton1.getX() + 100, boton1.getY(), boton1.getWidth(), boton1.getHeight());
                        break;
                    case 40://down
                        // JOptionPane.showMessageDialog(null, "abajo");
                        boton1.setBounds(boton1.getX(), boton1.getY() + 50, boton1.getWidth(), boton1.getHeight());
                        break;
                }
            }
        });

//        movimientos mov = new movimientos(boton1);
//        Thread hiloMov = new Thread(mov);
//        hiloMov.start();
//        boton1.addActionListener(new ActionListener() {
//            int posicion = 1;
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                boton2.setBounds(150 * posicion++, 50, boton2.getWidth(), boton2.getHeight());
//            }
//        });
        this.add(panelPrincipal);
    }

}
