/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo5.lab.ipc1.vacas;

import gui.cargamasiva;
import guicodigo.menu_principal;
import guicodigo.utiles;
import guicodigo.ventana;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elmer
 */
public class Ejemplo5LabIPC1Vacas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            utiles.cargarProductos(utiles.leerArchivo(utiles.rutaProductos));
             utiles.cargarUsuario(utiles.leerArchivo(utiles.rutaFacturas));
        } catch (IOException ex) {
            Logger.getLogger(Ejemplo5LabIPC1Vacas.class.getName()).log(Level.SEVERE, null, ex);
        }
//        menu_principal ventana = new menu_principal();
//        ventana.show();
        
        tablero ejemplo = new tablero();
        ejemplo.show();

    }

}
