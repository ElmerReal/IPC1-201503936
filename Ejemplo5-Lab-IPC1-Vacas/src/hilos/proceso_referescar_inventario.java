/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import guicodigo.utiles;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ComboBox;
import javax.swing.JComboBox;

/**
 *
 * @author elmer
 */
public class proceso_referescar_inventario implements Runnable {

    JComboBox cmb;

    public proceso_referescar_inventario(JComboBox cmb) {
        this.cmb = cmb;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = cmb.getItemCount(); i < 50; i++) {
                if (utiles.inventario[i] != null) {
                    cmb.addItem(utiles.inventario[i]);
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(proceso_referescar_inventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
