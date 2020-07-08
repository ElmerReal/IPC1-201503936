/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;

import guicodigo.utiles;
import hilos.proceso_refrescar_grafica1;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author elmer
 */
public class grafica1 extends JFrame {

    public grafica1() throws HeadlessException {
        this.setSize(700, 500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        crearChart();

    }

    public void crearChart() {
        JFreeChart barChart = ChartFactory.createBarChart(
                "GASTO vs CLIENTES",
                "CLIENTES",
                "GASTO",
                utiles.bancoClientes.generarDataSet(),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        setContentPane(chartPanel);
        
        proceso_refrescar_grafica1 proceso = new proceso_refrescar_grafica1(chartPanel);
        Thread hilo = new Thread(proceso);
        hilo.start();
        
        
    }


}
