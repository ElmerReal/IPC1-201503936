/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author elmer
 */
public class bancoClientes {

    cliente[] listaClientes;

    public bancoClientes(int cantidadClientes) {
        this.listaClientes = new cliente[cantidadClientes];
    }

    public void agregarCliente(cliente cl) {
        for (int i = 0; i < this.listaClientes.length; i++) {
            if (this.listaClientes[i] == null) {
                this.listaClientes[i] = cl;
                return;
            }
        }
    }

    public void imprimirBanco() {
        System.out.println(">>>>>>>>>>>>>>>> Banco <<<<<<<<<<<<<<<<<<<<<");
        for (int i = 0; i < this.listaClientes.length; i++) {
            if (this.listaClientes[i] == null) {
                System.out.println(">>>>>>>. Fin <<<<<<<<<<<<<<<<<");
                return;
            }
            this.listaClientes[i].imprimir();
        }
    }

    public DefaultCategoryDataset generarDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < this.listaClientes.length; i++) {
            if (this.listaClientes[i] == null) {
                break;
            }
            cliente cl = this.listaClientes[i];
            dataset.addValue(cl.montoCompra, cl.nombre, "Compra");
        }
        return dataset;
    }

}
