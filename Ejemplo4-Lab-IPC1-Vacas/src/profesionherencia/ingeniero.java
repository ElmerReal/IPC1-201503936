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
public class ingeniero /*implements investigador, catedratico*/ extends profesion{
 
    public ingeniero(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }
    
    
    @Override
    public void que_hace(){
        switch(this.tipo){
            case "MECANICO":
                System.out.println("Arreglo motores");
                break;
            case "SISTEMAS":
                System.out.println("Arreglo computadoras");
                break;
            case "AMBIENTAL":
                System.out.println("Planto arboles");
                break;
        }
    }
    
    @Override
    public void presente(){
        System.out.println("Hola, mi nombre es "+this.nombre+", tengo "+this.edad+" anios y soy ingeniero");
    }

//    @Override
//    public void investiga() {
//        System.out.println(investigador);
//    }
//
//    @Override
//    public void ensenia() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }


}
