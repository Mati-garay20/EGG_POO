
package servicios;

import entidades.Ahorcado;
import java.util.Scanner;

/*   Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
     Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
     Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
     Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
     Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
     Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
 */
public class ServicioJuego {
    
    Ahorcado J1 = new Ahorcado();
    Scanner leer = new Scanner(System.in);
    
    public void crearJuego(){
        
        System.out.println("Ingrese una palabra");
       
        String palabra = leer.next();
        J1.setCantLetras(palabra.length());
        
        System.out.println("Ingrese la cantidad maxima de intentos");
        J1.setJugadasMax(leer.nextInt());
        
        String [] arregloaux = new String [palabra.length()];
        arregloaux = palabra.split("");
        J1.setBuscar(arregloaux);
        
            
            
        
    
    }
    
    public void Longitud(){
        
    }
    
}
