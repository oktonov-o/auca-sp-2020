import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int d = inp.nextInt();
        int X= a*b-c*d;
        System.out.println("DIFERENCA = "+X);
    }
}
