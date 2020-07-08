/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo4.lab.ipc1.vacas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author elmer
 */
public class Ejemplo4LabIPC1Vacas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //     https://www.tutorialspoint.com/what-are-the-differences-between-jframe-and-jdialog-in-java
        JFrame frame = new JFrame("JFrame Demo");
        frame.setLocationRelativeTo(null);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
             //   System.exit(0);
                frame.dispose();
            }
        });
        JLabel lbl = new JLabel("JFrame Demo");
        lbl.setPreferredSize(new Dimension(175, 100));
        frame.getContentPane().add(lbl, BorderLayout.CENTER);
        frame.setSize(375, 275);
        frame.setVisible(true);
        profesionherencia.principal ventana = new profesionherencia.principal();
        ventana.primero();
    }

}
