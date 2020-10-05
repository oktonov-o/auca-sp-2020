import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();
        int hours = inp.nextInt();
        double salary = inp.nextDouble();
        System.out.printf("NUMBER = %d%n", number);
        System.out.printf("SALARY = U$ %.2f%n", salary*hours);
    }
}
