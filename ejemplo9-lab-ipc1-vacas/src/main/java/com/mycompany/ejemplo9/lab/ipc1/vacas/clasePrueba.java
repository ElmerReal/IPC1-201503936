/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplo9.lab.ipc1.vacas;

/**
 *
 * @author elmerreal
 */
public final class clasePrueba {

    public clasePrueba() {
//        System.out.println("Estoy dentro del constructor");
//        int valor = 10;
//        int resultado = 1;
//        int tempValor = valor;
//        while (tempValor == 1) {
//            System.out.println(tempValor);
//            resultado = resultado * tempValor;
//            tempValor--;
//        }
//        System.out.println("El factorial de " + valor + " es de " + resultado);
//        calcularFactorial(6);
        calcularFibonacci(5);
    }

    public void calcularFibonacci(int valor) {
        System.out.println("Quieres saber el valor de fibonacci no " + valor);
        System.out.println(auxCalcularFibonacci("", valor));

    }

    public int auxCalcularFibonacci(String tab, int valor) {
        if (valor == 0) {
            return 0;
        }
        if (valor == 1) {
            return 1;
        }
        System.out.println(tab+"auxCalcularFibonacci " + valor + ">>>>>>");
        int ultimo = auxCalcularFibonacci(tab + "\t", (valor - 1));
        int penultimo = auxCalcularFibonacci(tab + "\t", (valor - 2));
        System.out.println(tab+"Ultimo (" + (valor - 1) + ") " + ultimo);
        System.out.println(tab+"Penultimo (" + (valor - 2) + ") " + penultimo);
        System.out.println(tab+"Suma " + (ultimo + penultimo));
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        return ultimo + penultimo;
    }

    public void calcularFactorial(int valor) {
        int resultado = auxCalcularFactorial(valor);
        System.out.println("El factorial recursivamente de " + valor + " es de " + resultado);
    }

    public int auxCalcularFactorial(int tempValor) {
        if (tempValor == 1) {
            return 1;
        }
        System.out.println("Antes del recursivo " + tempValor);
        int calculoNumeroMenor = auxCalcularFactorial(tempValor - 1);
        System.out.println("Despues del recursivo " + tempValor);
        int resultado = tempValor * calculoNumeroMenor;
        return resultado;
    }

}
