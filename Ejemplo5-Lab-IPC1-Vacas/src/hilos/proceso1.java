/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elmer
 */
public class proceso1 extends Thread {
    @Override
    public void run(){
        int i =0;
        System.out.println("Metodo1 ------------------");
        while (true) {
            System.out.println("Metodo1 "+i);
            i++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(proceso1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
