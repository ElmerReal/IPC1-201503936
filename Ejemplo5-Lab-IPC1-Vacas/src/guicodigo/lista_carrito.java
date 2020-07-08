/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicodigo;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elmer
 */
public class lista_carrito {

    producto[] listaProductosCarrito = new producto[50];

    public lista_carrito(int tamanio_lista) {
        this.listaProductosCarrito = new producto[tamanio_lista];
    }

    public void agregarProductoLista(producto p) {
        for (int i = 0; i < listaProductosCarrito.length; i++) {
            if (listaProductosCarrito[i] == null) {
                listaProductosCarrito[i] = p;
                return;
            }
        }
    }

    public void imprimirLista() {
        for (int i = 0; i < listaProductosCarrito.length; i++) {
            if (listaProductosCarrito[i] != null) {
                listaProductosCarrito[i].imprimir();
            }
        }
    }

    public double calcularSubtotal() {
        double suma = 0;
        for (int i = 0; i < listaProductosCarrito.length; i++) {
            if (listaProductosCarrito[i] == null) {
                break;
            }
            suma += listaProductosCarrito[i].getValor();
        }
        return suma;
    }

    public int obtenerTamanioLista() {
        for (int i = 0; i < listaProductosCarrito.length; i++) {
            if (listaProductosCarrito[i] == null) {
                return i;
            }
        }
        return 0;
    }
    
    /*
    listaProductos 4
    prodA
    prodB
    prodC
    prodD
    
    
    Modelo 2
    prodA
    prodB
    prodC
    prodD
    
    
    
    
    
    */

    public void llenarModelo(DefaultTableModel model) {
        int tamanioArticulos = this.obtenerTamanioLista();
        for (int i = model.getRowCount(); i < tamanioArticulos; i++) {
            Object rowData[] = {i, listaProductosCarrito[i].getNombre(), listaProductosCarrito[i].getValor()};
            model.addRow(rowData);
        }
    }
}
