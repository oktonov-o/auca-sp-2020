import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();

        if(a+b>c && a+c>b && b+c>a){
            double p=a+b+c;
            System.out.printf("Perimetro = %.1f%n", p);
        } else {
            double area = (a+b)/2*c;
            System.out.printf("Area = %.1f%n", area);
        }
    }
}
