
package servicios;

import entidades.Fraccion;
import java.util.Scanner;

public class servicioFraccion {
    
    Scanner leer = new Scanner(System.in);
    Fraccion F1 = new Fraccion();
    
    public Fraccion crearFracciones(){
        
        System.out.println("Ingrese el primer numerador");
        F1.setNum1(leer.nextInt());
        
        System.out.println("Ingrese el primer denominador");
        F1.setDen1(leer.nextInt());
        
        System.out.println("Ingrese el segundo numerador");
        F1.setNum2(leer.nextInt());
        
        System.out.println("Ingrese el segundo denominador");
        F1.setDen2(leer.nextInt());
        
        return F1;
    }
    
    public void crearMenu(){  
        
        int opcion;
                
        do{
        System.out.println("Elija una Opción");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
        
        opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicacion ();
                break;
            case 4:
                division();
                break;
            case 5:
                System.out.println("Salio del Programa");
            default:
                System.out.println("Opcion Incorrecta!!");
                System.out.println("Vuelva a intentarlo");
                break;
                    
        }
            
        }while (opcion != 5);  
        
        
    }
    
    public void suma(){
        int Num3;
        int Den3;
               
        Num3 = (F1.getNum1()*F1.getDen2())+(F1.getDen1()*F1.getNum2());
        Den3 = F1.getDen1()*F1.getDen2();

        System.out.println("La Suma de las fraciones es: " + Num3 + "/" + Den3);        
        
    }
    
    public void resta(){
        int Num3;
        int Den3;
               
        Num3 = (F1.getNum1()*F1.getDen2())-(F1.getDen1()*F1.getNum2());
        Den3 = F1.getDen1()*F1.getDen2();

        System.out.println("La Resta de las fraciones es: " + Num3 + "/" + Den3); 
    }
    
    public void multiplicacion(){
        int Num3;
        int Den3;
               
        Num3 = (F1.getNum1()*F1.getNum2());
        Den3 = F1.getDen1()*F1.getDen2();

        System.out.println("La Multiplición de las fraciones es: " + Num3 + "/" + Den3); 
    }
    
    public void division(){
        int Num3;
        int Den3;
               
        Num3 = (F1.getNum1()*F1.getDen2());
        Den3 = F1.getDen1()*F1.getNum2();

        System.out.println("La División de las fraciones es: " + Num3 + "/" + Den3); 
    }
}
