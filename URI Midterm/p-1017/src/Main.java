import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double hours = inp.nextDouble();
        double kmPerHour = inp.nextDouble();
        double lit = hours * kmPerHour / 12;
        System.out.printf("%.3f%n", lit);
    }
}
