
package servicios;

import entidades.Matematica;

public class servicioMate {
    
    public double devolverMayor(Matematica M1){
        double mayor = 0;
     if (M1.getNum1() > M1.getNum2()){
        mayor = M1.getNum1;
        
     }else if(M1.getNum2() > M1.getNum1()){
        mayor = M1.getNum2;
     }
       
    return mayor;
    }    

    

    
    
}
