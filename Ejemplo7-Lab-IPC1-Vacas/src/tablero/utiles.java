/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author elmer
 */
public class utiles {

    public static String rutaImagenAuto1 = "/home/elmerreal/iconos/auto1.png";
    public static String rutaImagenAuto2 = "/home/elmerreal/iconos/auto2.jpg";
    public static int vidas = 5;

    public static JPanel CrearPaneles(int ancho, int alto, Color color) {
        JPanel panel = new JPanel(null);
        panel.setPreferredSize(new Dimension(alto, ancho));
        panel.setBackground(color);
        return panel;
    }

    public static JButton CrearBotones(String texto, int ancho, int alto, int x, int y, Color color) {
        JButton boton = new JButton(texto);
        boton.setBounds(x, y, ancho, alto);
        boton.setBackground(color);
        return boton;
    }

    public static JLabel CrearLabel(String rutaImagen, int ancho, int alto, int x, int y) {

        JLabel lbl = new JLabel();
        lbl.setBounds(10, 10, 100, 50);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(rutaImagen).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        lbl.setIcon(imageIcon);
        return lbl;
    }
}
