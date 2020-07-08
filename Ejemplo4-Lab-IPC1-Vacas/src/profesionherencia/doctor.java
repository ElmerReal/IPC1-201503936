/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profesionherencia;

/**
 *
 * @author elmer
 */
public class doctor extends profesion {
  
    public doctor(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    @Override
    public void que_hace() {
        switch (this.tipo) {
            case "PEDIATRA":
                System.out.println("curo ninios");
                break;
            case "CIRUJANO":
                System.out.println("abro cuerpos");
                break;
            case "NEUROCIRUJANO":
                System.out.println("abro cabezas");
                break;
        }
    }

    @Override
    public void presente() {
        System.out.println("Hola, mi nombre es " + this.nombre + ", tengo " + this.edad + " anios y soy doctor");
    }

}
