import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a1 = inp.nextDouble();
        double b1 = inp.nextDouble();
        double c1 = inp.nextDouble();
        double a;
        double b;
        double c;
        if (a1>=b1 && a1>=c1){
          a=a1;
          b=b1;
          c=c1;
        } else if (b1>=a1 && b1>=c1){
          a=b1;
          b=a1;
          c=c1;
        } else {
          a=c1;
          b=b1;
          c=a1;
        }
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
