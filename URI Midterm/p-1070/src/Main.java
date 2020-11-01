import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        if (n % 2 == 0){
            for (int i=n+1; i<=n+11; i+=2){
                System.out.println(i);
            }
        } else {
            for (int i=n; i<= n+10; i+=2){
                System.out.println(i);
            }
        }
    }
}
