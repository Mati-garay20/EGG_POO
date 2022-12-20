
package Ejercicio;

import entidades.Libro;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String ISBN;
        String Titulo;
        String Autor;
        int NumDePagina;
    
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        
        System.out.println("Ingrese los datos del libro que va a ingresar");
        System.out.println("Ingrese el ISBN");
            ISBN = leer.next();
            
        System.out.println("Ingrese el Título");
            Titulo = leer.next();
            
        System.out.println("Ingrese el Autor");
            Autor = leer.next();
        
        System.out.println("Ingrese el Número de Páginas");
            NumDePagina = leer.nextInt();
        
        Libro Libro1 = new Libro(ISBN, Titulo, Autor, NumDePagina);
        
        System.out.println(Libro1);
        
        
    }
}
