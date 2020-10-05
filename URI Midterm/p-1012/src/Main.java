import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        final double PI = 3.14159;
        int i=0;
        double[] num = new double[3];
        while (inp.hasNext()){
            num[i]= inp.nextDouble();
            i++;
        }
        double a = num[0];
        double b = num[1];
        double c = num[2];

        double triangulo = 1.0/2*a*c;
        double circulo = PI*c*c;
        double trapezio = (a+b)*c/2;
        double quadrado = b*b;
        double retangulo = a*b;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
    }
}
