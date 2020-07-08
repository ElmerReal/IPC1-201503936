/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author elmer
 */
public class movimientos implements Runnable {

    JButton jugador;

    public movimientos(JButton jugador) {
        this.jugador = jugador;
    }

    @Override
    public void run() {

        jugador.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("--------------------");
         
            }
        });

//        while (true) {
//
//        
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(movimientos.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }

}
