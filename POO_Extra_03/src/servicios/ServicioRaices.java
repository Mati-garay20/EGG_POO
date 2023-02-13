
package servicios;

import entidades.Raices;
import java.util.Scanner;


public class ServicioRaices {
    /*
     Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
//  Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
//  Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
//  Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
    */
    
        Raices R1 = new Raices();
        
        Scanner leer = new Scanner(System.in);
        
        
    public Raices crearRaiz(){
        
        System.out.println("Ingrese los valores de a, b, c");
        System.out.println("A: ");
        R1.setA(leer.nextInt());
        
        System.out.println("B: ");
        R1.setB(leer.nextInt());
        
        System.out.println("C: ");
        R1.setC(leer.nextInt());
        
        return R1;
    }
     public double getDiscriminante(Raices R1){
        int a = R1.getA();
        int b = R1.getB();
        int c = R1.getC();
            double dis = ((b^2) - 4*a*c);
            return dis;
    }
    
    public boolean tieneRaices(double dis){
        
        boolean dos = dis >= 0; 
        return dos;
    }
   
    public boolean tieneRaiz(double dis){
        
        boolean uno = (dis == 0);
        return uno;
    }
    
    public void obtenerRaices(boolean tieneRaices, boolean dos, Raices R1){
        
        int a = R1.getA();
        int b = R1.getB();
        int c = R1.getC();
        
        if(dos == true){
            
            System.out.println(((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
            System.out.println(((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
 
            
        }
        
    }
    
    public void obtenerRaiz(boolean tieneRaiz, boolean uno, Raices R1){
        int a = R1.getA();
        int b = R1.getB();
        int c = R1.getC();
        
        if(uno == true){
            System.out.println(((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
        }
        
    }
    
    public void calcular(boolean tieneRaiz, boolean tieneRaices, boolean obtenerRaiz, boolean obtenerRaices, boolean uno, boolean dos, Raices R1){
        
        if (tieneRaiz == true ){
            
            System.out.println(obtenerRaiz);
            
        }else if(tieneRaices == true){
            
            System.out.println(obtenerRaices);
            
        }else{
            System.out.println("No tiene solución!!");
        }
        
    }
    
}
