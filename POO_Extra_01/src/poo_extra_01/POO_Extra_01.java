
package poo_extra_01;

import entidades.Cancion;
import servicios.ServicioCancion;

public class POO_Extra_01 {

    /*
     1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
     */
    public static void main(String[] args) {
        
        ServicioCancion ser = new ServicioCancion();
        Cancion C1 = new Cancion();
        
        ser.crearCancion();
        
        System.out.println("Los datos de la canción son");
        
        System.out.println(ser.toString());
    }
    
}
