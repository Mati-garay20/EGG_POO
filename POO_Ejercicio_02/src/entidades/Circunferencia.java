
package entidades;


public class Circunferencia {

    /*
    2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
    tipo real. A continuación, se deben crear los siguientes métodos:
    a) Método constructor que inicialice el radio pasado como parámetro.
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
    objeto.
    d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
    e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
     */
   

     private double radio;
     public double area;
     public double perimetro;


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    } //
     
     public Circunferencia(double radio) {
        this.radio = radio;
    }
    
     public void crearCircunferencia(double radio){
         this.radio = radio;
     } //
     
    public double area(){
      area = 3.14 * Math.pow(radio, 2);
        return area;
    }
     
    public double perimetro(){
        perimetro = 2 * 3.14 * radio;
        return perimetro;
    }
    
    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
}
