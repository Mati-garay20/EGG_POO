
package servicios;

import entidades.Movil;
import java.util.Scanner;


public class ServicioMovil {
    
    /*
     Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
    
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
    */
    
    Scanner leer = new Scanner(System.in);
    Movil M1 = new Movil();
    
    public Movil cargarCelular(){
        
        System.out.println("- Tienda de Celulares -");
        System.out.println(". Marca del calular: ");
        M1.setMarca(leer.next());
        
        System.out.println(". Ingrese el precio: ");
        M1.setPrecio(leer.nextInt());
        
        System.out.println(". Modelo: ");
        M1.setModelo(leer.next());
        
        System.out.println(". Cantidad de Memoria RAM: ");
        M1.setMemoriaRam(leer.nextInt());
        
        System.out.println(". Cantidad de Almacenamiento: ");
        M1.setAlmacenaiento(leer.nextInt());
        
        
        return M1;
    }
    
    public void ingresarCodigo(){
        
        int aux [] = new int [7];
        
        System.out.println("Ingrese cógido del celular");
        
        for (int i = 0; i < 7; i++) {
            
            aux[i] = leer.nextInt();
            
        }
        
        for (int i = 0; i < 7; i++) {
            System.out.print("[" + aux[i] + "]  ");
        }
        
        System.out.println("");
        
        M1.setCodigo(aux);
        
    }
    
    
}
