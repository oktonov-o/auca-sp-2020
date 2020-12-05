import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();

        System.out.println(isPollindrome(n));
    }

    public static boolean isPollindrome (int n) {
        if (n == inverse(n)){
            return true;
        } else {
            return false;
        }
    }
    public static int inverse (int n) {
        int num=0, ten = 1;
        int tempN = n;
        while (tempN>0){
            ten *= 10;
            tempN /=10;
        }
        while (n>0){
            num += (n%10)*ten;
            ten /= 10;
            n /= 10;
        }
        return num;
    }
}
