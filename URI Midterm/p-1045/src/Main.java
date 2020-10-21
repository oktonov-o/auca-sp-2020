import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();

        if (a>=b+c){
            System.out.println("NAO FORMA TRIANGULO");
        }else{
            if (a*a==b*b+c*c){
                System.out.println("TRIANGULO RETANGULO");
            } else if (a*a>b*b+c*c){
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a==b && b==c){
                System.out.println("TRIANGULO EQUILATERO");
            } else if(a==b || b==c|| a==c){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}