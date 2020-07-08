/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicodigo;

import cliente.bancoClientes;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import graficas.*;
import hilos.proceso1;
import hilos.proceso2;

/**
 *
 * @author elmer
 */
public class menu_principal extends JFrame {

    public menu_principal() throws HeadlessException {
        this.setSize(250, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearObjetosInternos();
    }

    public void crearObjetosInternos() {
        JPanel pnlPrincipal = new JPanel(new FlowLayout());
        pnlPrincipal.setBackground(Color.YELLOW);
        JButton btnCargaMasiva = utiles.CrearBoton("Carga Masiva", 200, 35);
        btnCargaMasiva.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                accion_btnCargaMasiva(e);
            }
        });
        JButton btnComprar = utiles.CrearBoton("Comprar", 200, 35);
        btnComprar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                accion_btnComprar(e);
            }
        });
        JButton btnReporte1 = utiles.CrearBoton("Reporte1", 200, 35);
        btnReporte1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                accion_btnReporte1(e);
            }
        });

        pnlPrincipal.add(btnCargaMasiva);
        pnlPrincipal.add(btnComprar);
        pnlPrincipal.add(btnReporte1);

        this.add(pnlPrincipal);
    }

    public void accion_btnCargaMasiva(ActionEvent e) {
        ventana ventana = new ventana();
        ventana.show();
    }

    public void accion_btnComprar(ActionEvent e) {
        carrito ventana = new carrito();
        ventana.show();
    }

    public void accion_btnReporte1(ActionEvent e) {
        grafica1 ventana = new grafica1();
        ventana.show();
    }
}
