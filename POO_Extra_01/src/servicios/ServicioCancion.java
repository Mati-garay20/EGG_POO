
package servicios;

import entidades.Cancion;
import java.util.Scanner;


public class ServicioCancion {
    
    Cancion C1 = new Cancion();
    Scanner leer = new Scanner(System.in);
    
    public Cancion crearCancion(){
        
        System.out.println("- Ingrese el título de la canción");
        C1.setTitulo(leer.nextLine());
        
        System.out.println("- Ingrese el autor");
        C1.setAutor(leer.nextLine());
        
        return C1;
    }
    
}
