import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int m, n;
        while (inp.hasNext()){
            m = inp.nextInt();
            n = inp.nextInt();
            if (m > n){
                System.out.println("Decrescente");
            } else if (m < n){
                System.out.println("Crescente");
            } else {
                break;
            }
        }

    }
}
