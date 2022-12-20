package poo_ejercicio_06;

import entidades.Cafetera;
import java.util.Scanner;
import servicios.serviciosCafe;

public class POO_Ejercicio_06 {

    /*
    6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion;

        serviciosCafe ser = new serviciosCafe();

        Cafetera C1 = ser.crearCafetera();

        do {

            System.out.println("- Menu de Usuario -");
            System.out.println("1 - Llenar Cafetera");
            System.out.println("2 - Servir Taza");
            System.out.println("3 - Vaciar Cafetera");
            System.out.println("4 - Agregar Café");
            System.out.println("5 - Salir");

            System.out.println("Elija una opción");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    ser.llenarCafetera(C1);
                    break;
                case 2:
                    ser.servirTaza(C1);
                    break;
                case 3:
                    ser.vaciarCafetera(C1);
                    break;
                case 4:
                    ser.agregarCafe(C1);
                    break;
                case 5:
                    System.out.println("Sistema cerrado");
                default: 
                    System.out.println("Opción Erronea");
                    break;
            }

        } while (opcion != 5);

    }

}
