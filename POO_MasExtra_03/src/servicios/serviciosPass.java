package servicios;

import entidades.Pass;
import java.util.Scanner;

public class serviciosPass {

    /*
    ● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
    
● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
    
● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
    
● A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
     */
    
    Pass P1 = new Pass();
    Scanner sc = new Scanner(System.in);

    public void crarPass() {
        
        String contra = null;
        P1.setPass(contra);

        System.out.println("-- Crear Contraseña --");
        do {
            System.out.println("Ingrese 10 caracteres");
            contra = sc.nextLine();
        } while (contra.length() != 10);

       
    }
    
    public void analizarPass(){
        
        
        
    }

}
