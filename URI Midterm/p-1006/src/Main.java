import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float a = inp.nextFloat();
        float b = inp.nextFloat();
        float c = inp.nextFloat();
        float x=(a/10*2)+(b/10*3)+(c/10*5);
        System.out.printf("MEDIA = %.1f%n", x);
    }
}
