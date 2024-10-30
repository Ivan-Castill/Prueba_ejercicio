package FigurasRegulares;
import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    scanner.useLocale(Locale.US);
        try {
            System.out.println("*********************************");
            System.out.println("\n BIENVENIDOS USUARIO");
            System.out.println(" PROGRAMA DE CALCULO");
            System.out.print(" Cual calculo quiere realizar: " +
                    "\n  1.Cuadrado" +
                    "\n  2.Rectangulo" +
                    "\n  3.Circulo" +
                    "\n  4.Triangulo " +
                    "\n Ingrese su opcion: ");

            int opcion = scanner.nextInt();
            double area = 0, perimetro = 0;
            switch (opcion) {
                case 1:
                    System.out.print("\n Ingrese la medida del lado del Cuadrado: ");
                    double lado = scanner.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(lado);
                    cuadrado.imprimir_Cuadrado();
                    break;
                case 2:
                    System.out.print("Ingrese la medida de la BASE del Rectangulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la medida de la ALTURA del Rectangulo: ");
                    double altura = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(base, altura);
                    rectangulo.Imprimir_rectangulo();
                    break;
                case 3:
                    System.out.print("Ingrese la medida del RADIO del Circulo: ");
                    double radio = scanner.nextDouble();
                    Circulo circulo = new Circulo(radio);
                    circulo.Imprimir_circulo();
                    break;
                case 4:
                    System.out.print("Segun el grafico: ");
                    System.out.print("\n " +
                            "    *\n" +
                            "    +*+\n" +
                            " a + * + b\n" +
                            "  +  *  +\n" +
                            " +   * h +\n" +
                            "+++++*+++++\n" +
                            "    base\n");
                    System.out.print("Ingrese la medida del LADO A del Triangulo: ");
                    double lado_a = scanner.nextDouble();
                    System.out.print("Ingrese la medida del LADO B del Triangulo: ");
                    double lado_b = scanner.nextDouble();
                    System.out.print("Ingrese la medida de la BASE del Triangulo: ");
                    double base_t = scanner.nextDouble();
                    System.out.print("Ingrese la medida de la ALTURA(h) del Triangulo: ");
                    double altura_t = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(lado_a, lado_b, base_t, altura_t);
                    triangulo.Imprimir_triangulo();
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, intente de nuevo.");
                    break;
            }
        }catch (InputMismatchException e){
            System.out.println("Error: Entrada no valida. Asegurese de usar el separador decimal adecuado.");
        }finally {
            scanner.close();
        }
    }
}