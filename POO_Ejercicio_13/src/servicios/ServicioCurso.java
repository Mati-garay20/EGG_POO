
package servicios;

import entidades.Curso;
import java.util.Scanner;

/*
     método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro. 
 */
public class ServicioCurso {
    
        Scanner leer = new Scanner(System.in);
        Curso C1 = new Curso();
    
    public void cargarAlumnos(){
       
        String [] aux = new String [5];
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Ingrese nombre del alumno");
            aux[i] = leer.nextLine();
            
        }
        C1.setAlumnos(aux);
        
    }
    
    public Curso crearCurso(){
        
        System.out.println("Ingrese nombre del curso");
        C1.setNombreCurso(leer.nextLine());
        
        System.out.println("Ingrese la cantidad de horas");
        C1.setCantidadHoras(leer.nextInt());
        
        System.out.println("Ingrese la cantidad de días");
        C1.setCantidadDias(leer.nextInt());
        
        System.out.println("Ingrese el turno (Mañana o Tarde)");
        C1.setTurno(leer.next());
        
        System.out.println("Ingrese el precio por hora");
        C1.setPrecioHora(leer.nextInt());
        
        return C1;
        
    }
    
    public int calcularGanancia(){
        
       // Multiplicar cantidad de horas por dia       
       int horas = C1.getCantidadHoras()* C1.getCantidadDias();
               
       // Precio por horas
       int precio = C1.getPrecioHora() * horas;
       
       // Cantidad de alumnos
       int alumnos = 5 * precio;
       
       // Cantidad de dias a la semana
        int ganancia = alumnos * C1.getCantidadDias();
        
        System.out.println("La ganancia total del profesor es " + ganancia);
        
        return ganancia;
    }
    
    
}
