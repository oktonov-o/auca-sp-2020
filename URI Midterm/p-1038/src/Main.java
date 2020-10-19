import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int code = inp.nextInt();
        int quant = inp.nextInt();
        double total;
        if (code == 1) {
            total = 4.0*quant;
            System.out.printf("Total: R$ %.2f%n", total);
        } else if (code == 2) {
            total = 4.5*quant;
            System.out.printf("Total: R$ %.2f%n", total);
        } else if (code == 3) {
            total = 5.0*quant;
            System.out.printf("Total: R$ %.2f%n", total);
        } else if (code == 4) {
            total = 2.0*quant;
            System.out.printf("Total: R$ %.2f%n", total);
        } else {
            total = 1.5*quant;
            System.out.printf("Total: R$ %.2f%n", total);
        }
    }
}
