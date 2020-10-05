import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String names = inp.nextLine();
        double salary = inp.nextDouble();
        double bonus = inp.nextDouble();
        bonus*= 0.15;
        System.out.printf("TOTAL = R$ %.2f%n", salary+bonus);
    }
}
