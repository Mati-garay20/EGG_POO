
package poo_ejercicio_09;

import entidades.Matematica;
import servicios.servicioMate;

public class POO_Ejercicio_09 {

    /*
     9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
     */
    public static void main(String[] args) {
        
        Matematica M1 = new Matematica();
        servicioMate ser = new servicioMate();
        
        M1.setNum1(Math.random()*5);
        M1.setNum2(Math.random()*5);
        
        double mayor = ser.devolverMayor(M1);
        
        System.out.println( "Número 1: " + M1.getNum1() + "  Numero 2:" + M1.getNum2());
        System.out.println("El mayor es " + mayor);
        
      
    }
    
}
