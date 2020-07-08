/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.cola;

/**
 *
 * @author elmer
 */
public class cola {

    elementoCola primero;
    int contador = 0;

    public void encolar(elementoCola auxiliar) {
        auxiliar.setId(contador++);
        if (primero == null) {
            primero = auxiliar;
        } else {
            elementoCola temporal = primero;
            while (temporal.getSiguiente() != null) {
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(auxiliar);
        }
    }

    public void desencolar() {
        if (primero == null) {
            System.out.println("No tienes valores");
        } else {
            primero.imprimir();
            primero = primero.getSiguiente();
        }
    }

    public void imprimirCola() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        elementoCola temporal = primero;
        while (temporal != null) {
            temporal.imprimir();
            temporal = temporal.getSiguiente();
        }
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    public String imprimirHTML() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        String cadena = "<HTML>\n";
        cadena += "<BODY>\n";
        cadena += "<TABLE>\n";
        cadena += "<TR>\n";
        cadena += "<TH>ID </TH>\n";
        cadena += "<TH>VALOR </TH>\n";
        cadena += "</TR>\n";

        elementoCola temporal = primero;
        while (temporal != null) {
            cadena += "<TR>\n";
            cadena += "<TD>" + temporal.getId() + " </TD>\n";
            cadena += "<TD>" + temporal.getValor() + " </TD>\n";
        cadena += "</TR>\n";

            temporal.imprimir();
            temporal = temporal.getSiguiente();
        }

        cadena += "</TABLE>\n";

        cadena += "</BODY>\n";
        /*
         <table style="width:100%">
         <tr>
         <th>Firstname</th>
         <th>Lastname</th>
         <th>Age</th>
         </tr>
         <tr>
         <td>Jill</td>
         <td>Smith</td>
         <td>50</td>
         </tr>
         <tr>
         <td>Eve</td>
         <td>Jackson</td>
         <td>94</td>
         </tr>
         </table> 
         
         */

        cadena += "</html>";
        System.out.println(cadena);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        return cadena;
    }
}
