
package poo_masextra_02;

import entidades.Tiempo;
import servicios.servicioTiempo;


public class POO_MasExtra_02 {

    /**
     Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
     
     */
    public static void main(String[] args) throws InterruptedException {
        
        servicioTiempo st = new servicioTiempo();
        Tiempo T1 = new Tiempo();

        
        st.imprimirHoraCompleta();
        st.reloj(T1);
        
    }
    
}
