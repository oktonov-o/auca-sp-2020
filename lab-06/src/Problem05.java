import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("A = ");
        int a = inp.nextInt();
        System.out.print("B = ");
        int b = inp.nextInt();

        if (a == 0 && b == 0){
            System.out.println("GCD is undefined!");
        } else {
            System.out.printf("GCD(%d, %d) = %d", a, b, GCD(a,b));
        }
    }

    public static int GCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b > 0){
            a %= b;
            int temp = a;
            a = b;
            b = temp;
        }
        return a;
    }
}