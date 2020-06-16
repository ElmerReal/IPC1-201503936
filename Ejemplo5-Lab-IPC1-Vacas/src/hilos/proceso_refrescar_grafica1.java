/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import guicodigo.utiles;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

/**
 *
 * @author elmer
 */
public class proceso_refrescar_grafica1 implements Runnable {

    ChartPanel chartPanel;

    public proceso_refrescar_grafica1(ChartPanel chartPanel) {
        this.chartPanel = chartPanel;
    }

    @Override
    public void run() {
        while (true) {

            this.chartPanel = new ChartPanel(ChartFactory.createBarChart(
                    "GASTO vs CLIENTES",
                    "CLIENTES",
                    "GASTO",
                    utiles.bancoClientes.generarDataSet(),
                    PlotOrientation.VERTICAL,
                    true, true, false));
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(proceso_refrescar_grafica1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
