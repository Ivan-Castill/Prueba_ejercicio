package FigurasRegulares;

public class Triangulo {
    double lado_a;
    double lado_b;
    double lado_base;
    double altura;
    //constructor
    public Triangulo(double lado_a,double lado_b,double lado_base,double altura){
        this.lado_a=lado_a;
        this.lado_b=lado_b;
        this.lado_base=lado_base;
        this.altura=altura;
    }
    public double getLado_a(){
        return lado_a;
    }
    public void setLado_a(double lado_a){
        this.lado_a=lado_a;
    }

    public double getLado_b() {
        return lado_b;
    }
    public void setLado_b(double lado_b){
        this.lado_b=lado_b;
    }
    public double getLado_base(){
        return lado_base;
    }
    public void setLado_base(double lado_base){
        this.lado_base=lado_base;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public double Perimetro(){
        return lado_a+lado_b+lado_base;
    }
    public double Area(){
        return (lado_base+altura)/2;
    }
    public void Imprimir_triangulo(){
        System.out.println("La medida del Lado_A del Triangulo es : "+getLado_a()+" m");
        System.out.println("La medida del Lado_B del Triangulo es : "+getLado_b()+" m");
        System.out.println("La medida del Lado_base del Triangulo es : "+getLado_base()+" m");
        System.out.println("La medida de la Altura del Triangulo es : "+getAltura()+" m");
        System.out.println("El Perimetro del Triangulo es : "+Perimetro()+" m");
        System.out.println("El Area del Triangulo es : "+Area()+" m^2");
    }
}
