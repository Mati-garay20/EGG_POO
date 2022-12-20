
package ejercicio_02;

import entidades.Circunferencia;
import java.util.Scanner;


public class Ejercicio_02 {
    /*
    2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
    */
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el radio");
            double radio = leer.nextDouble();
         
         Circunferencia circun = new Circunferencia(radio);
        
         circun.area();
         circun.perimetro();
         
        System.out.println("Area= " + circun.area);
        System.out.println("Perimetro= " + circun.perimetro);
        System.out.println(circun); 
        
       
    }
    
}
