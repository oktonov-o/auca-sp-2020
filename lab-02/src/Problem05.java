import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Temperature in degrees Fahrenheit? ");
        double fah = inp.nextDouble();
        double cel = (fah - 32) * 5 / 9;
        System.out.printf("The temperature in degrees Celsius is %.2f%n", cel);
    }
}
