
package servicios;

import entidades.NIF;
import java.util.Scanner;

/*
 Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
POSICIÓN LETRA
0 T
1 R
2 W
3 A
4 G
5 M
6 Y
7 F
8 P
9 D
10 X
11 B
12 N
13 J
14 Z
15 S
16 Q
17 V
18 H
19 L
20 C
21 K
22 E
*/
public class ServicioNIF {
    
    NIF N1 = new NIF();
    Scanner leer = new Scanner(System.in);
    
    public NIF cargarDNI(){
        
        System.out.println("Ingrese número de DNI");
        N1.setDNI(leer.nextInt());
        
        return N1;
    }
    
    public int calcular(NIF N1){
        
       int resto;
       resto = N1.getDNI() % 23;
        System.out.println(resto);

        return resto;
    }
    
    public String crearNIF(int resto ){
        
        String [] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

       String L = letras[resto];
        
        return L;
    }
    
    public void mostrar(NIF N1, String L){
        
        System.out.println(N1.getDNI() + "-" + L);
        
    }
}
