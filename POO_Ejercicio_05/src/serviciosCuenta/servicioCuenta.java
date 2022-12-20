
package serviciosCuenta;

import entidades.Cuenta;
import java.util.Scanner;

public class servicioCuenta {
    
      Cuenta C1 = new Cuenta();
        
    public Cuenta crearCuenta(){
      Scanner leer = new Scanner(System.in);
           
        System.out.println("- Bienvenido Usuario -");
        System.out.println("Ingrese el número de cuenta");
        C1.setNumeroCuenta(leer.nextInt());
        
        System.out.println("Ingrese su DNI");
        C1.setDni(leer.nextLong());
        
        System.out.println("Ingrese el sueldo actual");
        C1.setSaldoActual(leer.nextInt());
        
          return C1;
        
    }
    
    public double ingresar(Cuenta C1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero que desea agregar");
           double ingreso = leer.nextDouble();
       
           double saldoNew = ingreso + C1.getSaldoActual();
                   
        return saldoNew;   
    }
    /*
        e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
    la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    pondrá el saldo actual en 0.
    */
    public double retirar(Cuenta C1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto a retirar");
            double retiro = leer.nextDouble();
        
        if (retiro > C1.getSaldoActual()){
        
            System.out.println("Saldo Actual en $0 ");
            
        }    
         double reti = C1.getSaldoNew() - retiro ;
         return reti;
          
    }

   
}
