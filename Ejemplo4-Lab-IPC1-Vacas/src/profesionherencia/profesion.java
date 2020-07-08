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
public abstract class profesion {

    String nombre = "";
    int edad = 0;
    String tipo = "";

    public abstract void que_hace();

    public abstract void presente();
    
    public void autenticare(String valor){
        
    }
    
    public void hola(){
        System.out.println("sfasdasffas");
    }

}
