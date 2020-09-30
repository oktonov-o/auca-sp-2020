import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Length in inches? ");
        double inch = inp.nextDouble();
        final double INCH_IN_CM = 2.54;
        double cm = inch * INCH_IN_CM;
        System.out.printf("%s in. = %.2f cm.%n", inch, cm);

    }
}
