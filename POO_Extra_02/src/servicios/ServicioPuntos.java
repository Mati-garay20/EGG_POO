
package servicios;

import entidades.Puntos;
import java.util.Scanner;


public class ServicioPuntos {
    
    /*
    Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.
    */
        Scanner leer = new Scanner(System.in);
        Puntos P1 = new Puntos();
        
    public Puntos crearPuntos(){
        
        System.out.println("Ingrese las coordenadas de X1 y de Y1");
        P1.setX1(leer.nextInt());
        P1.setY1(leer.nextInt());
        
        System.out.println("Ingrese las coordenadas de X2 y de Y2");
        P1.setX2(leer.nextInt());
        P1.setY2(leer.nextInt());
        
        
        return P1;
    }
    
    public double calcular(){
        
        double distancia = Math.sqrt(Math.pow((P1.getX2() - P1.getX1()), 2) + Math.pow((P1.getY2()-P1.getY1()), 2));

        
        return distancia;
    }
                
}
