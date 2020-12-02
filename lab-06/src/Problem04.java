import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("A = ");
        int a = inp.nextInt();
        System.out.print("B = ");
        int b = inp.nextInt();
        int tempA = a, tempB = b;

        while (b > 0){
            a %= b;
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.printf("GCD(%d, %d) = %d", tempA, tempB, a);
    }
}
