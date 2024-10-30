package FigurasRegulares;

public class Rectangulo {
    //atributos
    double base;
    double altura;
    //constructor
    public Rectangulo(double base,double altura){
        this.altura=base;
        this.base=base;
    }
    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base=base;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public double Perimetro(){
        return (2*altura)+(2*base);
    }
    public double Area(){
        return base*altura;
    }
    public void Imprimir_rectangulo(){
        System.out.println("La medida de la Base del Rectangulo es : "+getBase()+" m");
        System.out.println("La medida de la Altura del Rectangulo es : "+getAltura()+" m");
        System.out.println("El Perimetro del Rectangulo es : "+Perimetro()+" m");
        System.out.println("El Area del Rectangulo es : "+Area()+" m^2");
    }
}
