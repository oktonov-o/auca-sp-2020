import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        if (a>=b && a>=c){
            if (b>=c)
                System.out.println(c+"\n"+b+"\n"+a);
            else
                System.out.println(b+"\n"+c+"\n"+a);
        } else if (b>=a && b>=c){
            if (a>=c)
                System.out.println(c+"\n"+a+"\n"+b);
            else
                System.out.println(a+"\n"+c+"\n"+b);
        } else {
            if (a>=b)
                System.out.println(b+"\n"+a+"\n"+c);
            else
                System.out.println(a+"\n"+b+"\n"+c);
        }
        System.out.println("\n"+a+"\n"+b+"\n"+c);
    }
}
