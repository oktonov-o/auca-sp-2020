import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("A = ");
        int a = inp.nextInt();
        System.out.print("B = ");
        int b = inp.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("GCD is undefined!");
        } else {
            System.out.printf("GCD(%d, %d) = %d", a, b, GCD(a, b));
        }
    }

    public static int GCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
