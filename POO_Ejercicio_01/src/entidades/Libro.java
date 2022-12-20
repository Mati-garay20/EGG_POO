
package entidades;

public class Libro {

   
    
    /*
    1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
    */
    
    public String ISBN;
    public String Titulo;
    public String Autor;
    public int NumDePagina;
    
    
    public Libro(){
    
    }
    
     public Libro(String ISBN, String Titulo, String Autor, int NumeroDePagina) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumDePagina = NumeroDePagina;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumDePagina=" + NumDePagina + '}';
    }
}
