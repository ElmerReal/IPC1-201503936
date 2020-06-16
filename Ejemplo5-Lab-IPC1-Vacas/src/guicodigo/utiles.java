/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicodigo;

import cliente.bancoClientes;
import cliente.cliente;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author elmer
 */
public class utiles {

    public static producto[] inventario = new producto[50];
    public static bancoClientes bancoClientes = new bancoClientes(10000);
    public static String rutaFacturas = "C:\\IPC1\\Facturas.ipc1";
    public static String rutaProductos = "C:\\IPC1\\Productos.ipc1";

    public static JButton CrearBoton(String texto, int ancho, int alto) {
        JButton btn = new JButton(texto);
        btn.setPreferredSize(new Dimension(ancho, alto));
        return btn;
    }

    public static JComboBox CrearComboBox(int ancho, int alto) {
        JComboBox cmb = new JComboBox();
        cmb.setPreferredSize(new Dimension(ancho, alto));
        return cmb;
    }

    public static JTextArea CrearTextArea(String texto, int ancho, int alto) {
        JTextArea txt = new JTextArea(texto);
        txt.setPreferredSize(new Dimension(ancho, alto));
        return txt;
    }

    public static JTextField CrearTextField(String texto, int ancho, int alto) {
        JTextField txt = new JTextField(texto);
        txt.setPreferredSize(new Dimension(ancho, alto));
        return txt;
    }

    public static String leerArchivo(String ruta) throws FileNotFoundException, IOException {
        String texto = "";
        File file = new File(ruta);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            texto += st + "\n";
        }
        return texto;
    }

    public static void escribirArchivo(String ruta, String data) {
        File file = new File(ruta);
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
            fr.write(data + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void cargarProductos(String info) {
        String[] datos = info.split("\n");
        for (String dato : datos) {
            String[] infoActividad = dato.split(",");
            switch (infoActividad[0]) {
                case "PRODUCTO":
                    agregarProducto(new producto(infoActividad[1], infoActividad[2]));
                    break;
            }
        }
    }

    public static void agregarProducto(producto obj) {
        for (int i = 0; i < 50; i++) {
            if (utiles.inventario[i] == null) {
                utiles.inventario[i] = obj;
                return;
            }
        }
    }

    public static void cargarUsuario(String info) {
        String[] datos = info.split("\n");
        for (String dato : datos) {
            String[] infoActividad = dato.split(",");
            switch (infoActividad[0]) {
                case "CLIENTE":
                    bancoClientes.agregarCliente(new cliente(infoActividad[1], Double.parseDouble(infoActividad[2])));
                    break;
            }
        }

    }
}
