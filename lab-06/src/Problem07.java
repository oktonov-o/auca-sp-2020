import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = inp.nextInt();

        System.out.println("It is palindrome: " + isPalindrome(n));
        System.out.println(reverse(n));
    }

    public static boolean isPalindrome (int n) {
        if (n == reverse(n)){
            return true;
        } else {
            return false;
        }
    }
    public static int reverse (int n) {
        int num=0;
        double ten = 0.1;
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
