import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        if (b%a==0 || a%b==0)
            System.out.println("Sao Multiplos");
        else
            System.out.println("Nao sao Multiplos");
    }
}
