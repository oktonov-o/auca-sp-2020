import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        if (a>=b && a>=c){
            if (b>=c)
                System.out.println(c+" "+b+" "+a);
            else
                System.out.println(b+" "+c+" "+a);
        } else if (b>=a && b>=c){
            if (a>=c)
                System.out.println(c+" "+a+" "+b);
            else
                System.out.println(a+" "+c+" "+b);
        } else {
            if (a>=b)
                System.out.println(b+" "+a+" "+c);
            else
                System.out.println(a+" "+b+" "+c);
        }

    }
}
