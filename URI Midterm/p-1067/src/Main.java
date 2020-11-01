import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for (int i=1; i<=n; i+=2){
            System.out.println(i);
        }
    }
}
