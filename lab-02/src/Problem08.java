import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pound = inp.nextDouble();
        final double POUND_IN_KG = 0.454;
        double kg = pound * 0.454;
        System.out.printf("%s pounds is %.3f kilograms%n", pound,kg);

    }
}
