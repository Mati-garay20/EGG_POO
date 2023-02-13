/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


public class Ahorcado {
    
    private String [] buscar; 
    private int cantLetras;
    private int jugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] buscar, int cantLetras, int jugadasMax) {
        this.buscar = buscar;
        this.cantLetras = cantLetras;
        this.jugadasMax = jugadasMax;
    }

    public String[] getBuscar() {
        return buscar;
    }

    public void setBuscar(String[] buscar) {
        this.buscar = buscar;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }
    
    
}
