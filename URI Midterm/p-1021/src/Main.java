import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double cash = inp.nextDouble();
        int cash100= (int)(cash*100);
        int n100 = cash100/10000;
        int x = cash100%10000;
        int n50 = x/5000;
        x %= 5000;
        int n20 = x/2000;
        x %= 2000;
        int n10 = x/1000;
        x %= 1000;
        int n5 = x/500;
        x %= 500;
        int n2 = x/200;
        x %= 200;
        int c100 = x/100;
        x %= 100;
        int c50 = x/50;
        x %= 50;
        int c25 = x/25;
        x %= 25;
        int c10 = x/10;
        x %= 10;
        int c5 = x/5;
        x %= 5;
        int c1 =x;

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00%n", n100);
        System.out.printf("%d nota(s) de R$ 50.00%n", n50);
        System.out.printf("%d nota(s) de R$ 20.00%n", n20);
        System.out.printf("%d nota(s) de R$ 10.00%n", n10);
        System.out.printf("%d nota(s) de R$ 5.00%n", n5);
        System.out.printf("%d nota(s) de R$ 2.00%n", n2);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00%n", c100);
        System.out.printf("%d moeda(s) de R$ 0.50%n", c50);
        System.out.printf("%d moeda(s) de R$ 0.25%n", c25);
        System.out.printf("%d moeda(s) de R$ 0.10%n", c10);
        System.out.printf("%d moeda(s) de R$ 0.05%n", c5);
        System.out.printf("%d moeda(s) de R$ 0.01%n", c1);
    }
}