
package servicios;

import entidades.Arreglos;
import java.util.Arrays;

public class serviciosArreglo {
    
     /*
    10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
    */
    
        Arreglos A1 = new Arreglos();
        
        public void llenarA(){
            double [] arregloAux = new double [50];
            
            System.out.println("   Arreglo A");
            
            for (int i = 0; i < 50; i++) {
                arregloAux[i] = Math.round(((Math.random()*10) + 1) * 100.0 ) / 100.0 ;
                
                System.out.print("[" + arregloAux[i] + "] ");
                
            }
            System.out.println("");
            
            Arrays.sort(arregloAux);
            A1.setArregloA(arregloAux);
            
            System.out.println("   Arreglo A Ordenado");
            for (int i = 0; i < 50; i++) {

                System.out.print("[" + arregloAux[i] + "] ");
            }
            System.out.println("");
        }
        
    
       
        public void llenarB(){
            
            double [] arregloAux2 = new double [20];
            
            System.out.println("   Arreglo B");
            
            for (int i = 0; i < 10; i++) {
                arregloAux2[i] = A1.getArregloA()[i];
                
                System.out.print("[" + arregloAux2[i] + "] ");
            }
           
            
            for (int i = 10; i < 20; i++) {
                 arregloAux2[i] = 0.5;
                System.out.print("[" + arregloAux2[i] + "] ");
                
            }
             System.out.println("");
             
             A1.setArregloB(arregloAux2);
        }
    
}
