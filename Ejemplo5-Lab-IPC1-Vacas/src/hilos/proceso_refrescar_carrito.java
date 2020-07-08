/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import guicodigo.lista_carrito;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author elmer
 */
public class proceso_refrescar_carrito extends Thread {

    DefaultTableModel modelo;
    lista_carrito listaCarrito;

    public proceso_refrescar_carrito(DefaultTableModel modelo, lista_carrito listaCarrito) {
        this.modelo = modelo;
        this.listaCarrito = listaCarrito;
    }

    @Override
    public void run() {
        while (true) {

            listaCarrito.llenarModelo(this.modelo);

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(proceso_referescar_inventario.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
