import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        double det = b*b-4*a*c;
        double root, root1, root2;
        if (det < 0 || a == 0){
            System.out.println("Impossivel calcular");
        } else if ( det == 0){
            root = -b/2*a;
            System.out.printf("R = %.5f%n", root);
        } else {
            root1 = (Math.sqrt(det)-b)/2*a;
            root2 = (-Math.sqrt(det)-b)/2*a;
            System.out.printf("R1 = %.5f%n", root1);
            System.out.printf("R2 = %.5f%n", root2);
        }
    }
}
