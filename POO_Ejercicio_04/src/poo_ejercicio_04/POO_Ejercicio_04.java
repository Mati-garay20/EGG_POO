
package poo_ejercicio_04;

import java.util.Scanner;

public class POO_Ejercicio_04 {

    /*
    4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
    */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese la base del rectangulo");
        double base = leer.nextDouble();
        
        System.out.println("Ingrese la altura del rectangulo");
        double altura = leer.nextDouble();
        
        Rectangulo rec = new Rectangulo(base, altura);
        
        rec.superficie();
        rec.perimetro();
        
        System.out.println("Superficie: " + rec.superficie);
        System.out.println("Perimetro: " + rec.perimetro);
        
        System.out.println(rec.muestra());
        
        
        
    }
    
}
