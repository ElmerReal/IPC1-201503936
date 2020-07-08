/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tablero.utiles;

/**
 *
 * @author elmer
 */
public class ganar_perder implements Runnable {

    @Override
    public void run() {
        while (true) {
            if (utiles.vidas == 0) {
                JOptionPane.showMessageDialog(null, "Ya perdiste");
                return;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(ganar_perder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
