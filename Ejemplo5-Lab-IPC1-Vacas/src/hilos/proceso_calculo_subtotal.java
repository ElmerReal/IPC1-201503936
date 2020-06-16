/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import guicodigo.lista_carrito;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author elmer
 */
public class proceso_calculo_subtotal implements Runnable{
lista_carrito listaCarrito;
JTextField txt;
    public proceso_calculo_subtotal(lista_carrito listaCarrito, JTextField txt) {
        this.listaCarrito = listaCarrito;
        this.txt = txt;
    }
    
    

    @Override
    public void run() {
        while(true){
            txt.setText(String.valueOf(listaCarrito.calcularSubtotal()));
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(proceso_calculo_subtotal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
