package FigurasRegulares;

public class Cuadrado {
    //atributos
    double lado;
    //constructor
    public Cuadrado(double lado){
        this.lado=lado;
    }
    public double getlado(){
        return lado;
    }
    public void setlado(double lado){
        this.lado=lado;
    }
    public double Perimetro(){
        return 4*lado;
    }
    public double Area(){
        return lado*lado;
    }
    public void imprimir_Cuadrado(){
        System.out.println("La medida del lado del Cuadrado es: "+getlado()+" m");
        System.out.println("El Perimetro del Cuadrado es: "+Perimetro()+" m ");
        System.out.println("El Area del Cuadrado es: "+Area()+" m^2 ");
    }
}
