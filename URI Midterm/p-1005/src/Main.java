import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float a = inp.nextFloat();
        float b = inp.nextFloat();
        double x=(a/11 * 3.5) + (b/11 * 7.5);
        System.out.printf("MEDIA = %.5f%n", x);
    }
}
