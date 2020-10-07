import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("1st number? ");
        int a= inp.nextInt();
        System.out.print("2nd number? ");
        int b= inp.nextInt();
        System.out.print("3rd number? ");
        int c= inp.nextInt();
        if (a >= b && a >= c) {
            System.out.printf("The value %d is the greatest one.", a);
        } else if (b >= a && b >= c) {
            System.out.printf("The value %d is the greatest one.", b);
        } else {
            System.out.printf("The value %d is the greatest one.", c);
        }
    }
}
