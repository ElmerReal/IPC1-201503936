/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author elmer
 */
public class jugador {
    private String nickname;
    private int vidas;
    private int monedas;

    public jugador(String nickname, int vidas, int monedas) {
        this.nickname = nickname;
        this.vidas = vidas;
        this.monedas = monedas;
    }
     public jugador() {
        this.nickname = "";
        this.vidas = 0;
        this.monedas = 0;
    }
    
    

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public String getNickname() {
        return nickname;
    }

    public int getVidas() {
        return vidas;
    }

    public int getMonedas() {
        return monedas;
    }
    public void imprimir(){
        System.out.println("Nombre "+this.nickname+", Vidas "+this.vidas+", Monedas "+this.monedas);
    }
    
}
