import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();
        System.out.println(sumDigits(num));
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n >= 1){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
