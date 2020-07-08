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
public class principal {
//static int a = 50,b = 70;

    public void primero() {
          int x = 50;
          patito obj = new patito();
          obj.edad = 63;
          obj.nombre = "Patito1";
          int z = 30;
          patito obj1 = new patito();
          obj1.edad = 70;
            obj1.nombre = "Hola";
            obj= obj1;
          //System.out.println(obj1.edad);//63
            
            int a [] = new int [10];
            a [5] = 80;
          
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 //    String[][] usuarios = new String[5][3];
//    
//    public void ejemplo(){
//        //        profesion[] arreglo = new profesion[6];
////        arreglo[0] = new ingeniero("Elmer", 30, "MECANICO");
////        arreglo[1] = new ingeniero("Juan", 35, "SISTEMAS");
////        arreglo[2] = new ingeniero("Orlando", 70, "AMBIENTAL");
////        arreglo[3] = new doctor("Mario", 50, "PEDIATRA");
////        arreglo[4] = new doctor("Esteban", 30, "CIRUJANO");
////        arreglo[5] = new doctor("Jorge", 60, "NEUROCIRUJANO");
////
////        for (profesion obj : arreglo) {
////            obj.que_hace();
////            obj.presente();
////            System.out.println("-------------------------");
////        }
//        agregarUsuario("Elmer", "123", "ABD");
//        agregarUsuario("Juan", "563", "ABadfafdaD");
//        agregarUsuario("Pedro", "417", "afdasfABD");
//        imprimirUsusarios();
//        existe("Elmer");
//    }
//
//    public void agregarUsuario(String nombre, String numero, String dpi) {
//        for (int i = 0; i < 5; i++) {
//            if (usuarios[i][0] == null) {
//                usuarios[i][0] = nombre;
//                usuarios[i][1] = numero;
//                usuarios[i][2] = dpi;
//                break;
//            }
//        }
//    }
//
//    public void imprimirUsusarios() {
//        for (int i = 0; i < 5; i++) {
//                System.out.println(usuarios[i][0] + ", " + usuarios[i][1] + ", " + usuarios[i][2]);
//        }
//    }
//
//    
//    public void existe(String nombre){
//         for (int i = 0; i < 5; i++) {
//             if (usuarios[i][0] != null) {
//                 if(usuarios[i][0].equals(nombre)){
//                     System.out.println("Si existe");
//                     return;
//                 }
//             }
//        }
//         System.out.println("No existe");
//    }
}
