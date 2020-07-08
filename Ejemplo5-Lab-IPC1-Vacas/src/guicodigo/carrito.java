/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicodigo;

import cliente.bancoClientes;
import cliente.cliente;
import hilos.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author elmer
 */
public class carrito extends JFrame {

    lista_carrito listaCarrito = new lista_carrito(20);
    JComboBox cmbDatos = utiles.CrearComboBox(200, 35);
    Object columnNames[] = {"Column One", "Column Two", "Column Three"};
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);

    public carrito() throws HeadlessException {
        this.setSize(700, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearObjetosInternos();
    }

    public void crearObjetosInternos() {
        JPanel pnlPrincipal = new JPanel(new FlowLayout());
        pnlPrincipal.setBackground(Color.GREEN);

        //------------- Botones ----------------------
        JButton btnAgregar = utiles.CrearBoton("Agregar", 200, 35);
        JButton btnProcesar = utiles.CrearBoton("Procesar", 200, 35);
        JButton btnCancelar = utiles.CrearBoton("Cancelar", 200, 35);

        JTextField txtSubtotal = utiles.CrearTextField("0.00", 200, 35);
        //------------ Combo box ---------------------------
        //----------------------------------------------

        JTable tabla = new JTable(model);

//        tabla.setModel(model);
        tabla.setPreferredSize(new Dimension(500, 200));

        btnCancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                accion_btnCancelar(e);
            }
        });

        //------------------ Action listener -------------------------
        btnAgregar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                agregarListaCarrito(e);
            }
        });
        btnProcesar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                accion_btnProcesar(e);
            }
        });
        //-----------------------------------------------------------
        pnlPrincipal.add(cmbDatos);
        pnlPrincipal.add(btnAgregar);
        pnlPrincipal.add(tabla);
        pnlPrincipal.add(txtSubtotal);
        pnlPrincipal.add(btnProcesar);
        pnlPrincipal.add(btnCancelar);
        this.add(pnlPrincipal);

        proceso_referescar_inventario proceso = new proceso_referescar_inventario(cmbDatos);
        Thread hilo = new Thread(proceso);
        hilo.start();

        proceso_refrescar_carrito proceso1 = new proceso_refrescar_carrito(this.model, this.listaCarrito);
        Thread hilo1 = new Thread(proceso1);
        hilo1.start();

        proceso_calculo_subtotal proceso2 = new proceso_calculo_subtotal(listaCarrito, txtSubtotal);
        Thread hilo2 = new Thread(proceso2);
        hilo2.start();
    }

    public void accion_btnCancelar(ActionEvent e) {
        this.dispose();
    }

    public void agregarListaCarrito(ActionEvent e) {
        listaCarrito.agregarProductoLista((producto) this.cmbDatos.getSelectedItem());
    }

    public void accion_btnProcesar(ActionEvent e) {
        String nombreCliente = JOptionPane.showInputDialog("Cual es su nombre?");
        System.out.println("El cliene [" + nombreCliente + "] gasto " + listaCarrito.calcularSubtotal());
        utiles.bancoClientes.agregarCliente(new cliente(nombreCliente, this.listaCarrito.calcularSubtotal()));
        utiles.bancoClientes.imprimirBanco();
        utiles.escribirArchivo(utiles.rutaFacturas, "CLIENTE,"+nombreCliente+","+listaCarrito.calcularSubtotal());
        this.dispose();
    }

}
