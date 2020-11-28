import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("The number is ");
        n = inp.nextInt();

        while (true){
            if (n==0){
                break;
            } else {
                sum += n;
                n--;
                continue;
            }
        }
        System.out.println("The sum is " + sum);
    }
}
