package FigurasRegulares;

public class Circulo {
    //atributos
    double radio;
    //constructor
    public Circulo(double radio){
        this.radio=radio;
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio=radio;
    }
    public double Perimetro(){
        return 2*3.14*radio;
    }
    public double Area(){
        return 3.15*radio*radio;
    }
    public void Imprimir_circulo(){
        System.out.println("La medida del Radio del circulo es : "+getRadio()+" m");
        System.out.println("El Perimetro del Circulo es : "+Perimetro()+" m");
        System.out.println("El Area del Circulo es : "+Area()+" m^2");
    }
}
