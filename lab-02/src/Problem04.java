import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Length in inches? ");
        int inch = inp.nextInt();
        final double INCH_IN_CM = 2.54;
        System.out.println(inch + " in. = " + inch * INCH_IN_CM + " cm.");

    }
}
