/*35
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicodigo;

import gui.repuesto;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import hilos.*;

/**
 *
 * @author elmer
 */
public class ventana extends JFrame {

    public ventana() throws HeadlessException {
        this.setSize(250, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearObjetosInternos();
    }

    public void crearObjetosInternos() {
        JPanel pnlPrincipal = new JPanel(new FlowLayout());
        pnlPrincipal.setBackground(Color.BLACK);

        //------------- Botones ----------------------
        JButton btnCargarDatos = utiles.CrearBoton("Cargar", 200, 35);
        JButton btnCancelar = utiles.CrearBoton("Cancelar", 200, 35);
        //------------ Combo box ---------------------------
        JComboBox cmbDatos = utiles.CrearComboBox(200, 35);
        //-------------- TXT Carga -----------------
        JTextArea txtCarga = utiles.CrearTextArea("", 200, 50);
        //---------------------------------------------
        //-------------- Buton cargar Datos -----------------

        btnCargarDatos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                      String info = txtCarga.getText();
                      utiles.cargarProductos(info);
            }
        });
        
     
        //----------------------------------------------
        pnlPrincipal.add(txtCarga);
        pnlPrincipal.add(btnCargarDatos);
        pnlPrincipal.add(cmbDatos);
        btnCancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                accion_btnCancelar(e);
            }
        });
        pnlPrincipal.add(btnCancelar);
        this.add(pnlPrincipal);
        proceso_referescar_inventario proceso = new proceso_referescar_inventario(cmbDatos);
        Thread hilo = new Thread(proceso);
        hilo.start();

    }

    public void accion_btnCancelar(ActionEvent e) {
        this.dispose();
    }
    
  
 
}
