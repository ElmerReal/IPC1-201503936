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
public class proceso2 implements Runnable {

    @Override
    public void run() {
       System.out.println("Metodo2 ----------------------");
        for (int i = 0; i < 100; i++) {
            System.out.println("Metodo2 " + i);
           try {
               Thread.sleep(150);
           } catch (InterruptedException ex) {
               Logger.getLogger(proceso2.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        System.out.println("########## Fin metodo 2 ###################");
    }
    
}
