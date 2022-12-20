package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/*
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
public class ServiciosPersona {

    Scanner leer = new Scanner(System.in);

    Persona P1 = new Persona();

    public Persona crearPersona() {
        int anio, mes, dia;

        System.out.println("Ingrese su nombre");
        P1.setNombre(leer.next());

        System.out.println("Ingrese el año de nacimiento");
        anio = leer.nextInt();

        System.out.println("Ingrese el mes de nacimiento");
        mes = leer.nextInt();

        System.out.println("Ingrese el día de nacimiento");
        dia = leer.nextInt();

        P1.setFechaNacimiento(new Date(anio - 1900, mes - 1, dia));

        return P1;

    }

    public int calcularEdad() {

        Date fechaActual = new Date();

        int edad = fechaActual.getYear() - P1.getFechaNacimiento().getYear();

        return edad;
    }

    public boolean menorQue(int edad) {
        
        
        return edad < 18;

    }
    
    public void mostrarPersona(){
        
        System.out.println(P1);
        
    }
    

}
