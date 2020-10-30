import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Edges? ");
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        if (a+b>c && a+c>b && b+c>a){
            double perimeter = a+b+c;
            System.out.println("Perimeter: "+ perimeter);
        } else {
            System.out.println("The input is invalid");
        }
    }
}
