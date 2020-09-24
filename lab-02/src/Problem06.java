import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double cel = inp.nextDouble();
        double fah = 9.0 / 5 * cel + 32;
        System.out.printf("%s Celsius is %.1f Fahrenheit", cel, fah);
    }
}
