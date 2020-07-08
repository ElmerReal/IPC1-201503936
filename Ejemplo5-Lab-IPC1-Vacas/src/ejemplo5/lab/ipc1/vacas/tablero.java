/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo5.lab.ipc1.vacas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author elmer
 */
public class tablero extends JFrame {

    private Object frame;

    public tablero() throws HeadlessException {
        this.setSize(800, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearObjetosInternos();
    }

    public void crearObjetosInternos() {
        JPanel pnlPrincipal = new JPanel(null);
        pnlPrincipal.setBackground(Color.YELLOW);
// ImageIcon imageIcon = new ImageIcon("yourFile.gif");
//    JLabel label = new JLabel(imageIcon);
        JButton b1 = new JButton("one");
        JLabel b2 = new JLabel("two");
        b2.setBackground(Color.red);
        b2.setOpaque(true);
        JButton b3 = new JButton("three");
        int x = 55;
        b1.addActionListener(new ActionListener() {
            int contador = 1;

            @Override
            public void actionPerformed(ActionEvent e) {
                b2.setBounds(contador++ * 150 + 25, 30, 150, 30);
            }
        });

        pnlPrincipal.add(b1);
        pnlPrincipal.add(b2);
        pnlPrincipal.add(b3);

        b1.setBounds(25, 0, 150, 30);
        b2.setBounds(25, 30, 150, 30);
        b3.setBounds(25, 60, 150, 30);

        this.add(pnlPrincipal);
    }
}
