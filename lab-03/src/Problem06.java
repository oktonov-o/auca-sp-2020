import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        double det = b*b-4*a*c;
        double root, root1, root2;
        if (det < 0 || a == 0){
            System.out.println("The equation has no real roots");
        } else if ( det == 0){
            root = (-b)/(2*a);
            System.out.printf("The equation has one root %.6f%n", root);
        } else {
            root1 = (Math.sqrt(det)-b)/(2*a);
            root2 = (-Math.sqrt(det)-b)/(2*a);
            System.out.printf("The equation has two roots %.6f and %.5f%n", root1, root2);
        }
    }
}
