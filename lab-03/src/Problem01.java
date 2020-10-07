import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("some real number? ");
        double number= inp.nextDouble();
        if (number >= 0) {
            System.out.println("|" + number + "| = " + number);
        } else {
            System.out.println("|" + number + "| = " + (-1) * number);
        }
    }
}
