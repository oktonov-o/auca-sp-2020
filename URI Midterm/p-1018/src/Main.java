import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int cash = inp.nextInt();
        int c100 = cash / 100;
        int c50 = cash % 100 / 50;
        int c20 = cash % 100 % 50 / 20;
        int c10 = cash % 100 % 50 % 20 / 10;
        int c5 = cash % 100 % 50 % 20 % 10 / 5;
        int c2 = cash % 100 % 50 % 20 % 10 % 5 / 2;
        int c1 = cash % 100 % 50 % 20 % 10 % 5 % 2;

        System.out.println(cash);
        System.out.printf("%d nota(s) de R$ 100,00%n", c100);
        System.out.printf("%d nota(s) de R$ 50,00%n", c50);
        System.out.printf("%d nota(s) de R$ 20,00%n", c20);
        System.out.printf("%d nota(s) de R$ 10,00%n", c10);
        System.out.printf("%d nota(s) de R$ 5,00%n", c5);
        System.out.printf("%d nota(s) de R$ 2,00%n", c2);
        System.out.printf("%d nota(s) de R$ 1,00%n", c1);
    }
}
