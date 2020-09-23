import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b;
        System.out.print("1st value? ");
        a = inp.nextInt();
        System.out.print("2nd value? ");
        b = inp.nextInt();
        System.out.println("Before swapping: a = "+a+"; b = "+b+";");
        int i = a;
        a=b;
        b=i;
        System.out.println("Before swapping: a = "+a+"; b = "+b+";");

    }
}
