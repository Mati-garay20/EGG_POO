
package poo_ejercicio_04;


public class Rectangulo {

   
    private double base;
    private double altura;
    public double superficie;
    public double perimetro;
    public String muestra;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double superficie(){
        superficie = base * altura; 
        return superficie;
    }
    
    public double perimetro(){
        perimetro = (base + altura) * 2;
        return perimetro;
    }
            
    public String muestra(){
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print(" * ");
                System.out.print("");
            }
            System.out.println("");
        }
        return muestra;
    }
     
    
}
