import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("A four-digit integer? ");
        int num = inp.nextInt();
        int sum= num%10+ num/10%10+ num/100%10+ num/1000%10;
        System.out.println("The sum of all digits is "+sum);
    }
}
