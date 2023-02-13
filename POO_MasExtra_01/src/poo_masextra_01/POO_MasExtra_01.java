
package poo_masextra_01;

import servicios.servicioFraccion;

public class POO_MasExtra_01 {

    /*
    Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
     */
    public static void main(String[] args) {
        
        servicioFraccion sf = new servicioFraccion();
        
        sf.crearFracciones();
        sf.crearMenu();
        sf.suma();
        sf.resta();
        sf.multiplicacion();
        sf.division();
    }
    
}
