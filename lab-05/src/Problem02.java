import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Integer? ");
        int number = inp.nextInt();
        int sum=0;
        while (number >= 1){
            sum += number % 10;
            number /= 10;
        }
        System.out.println("The sum of all digits is "+sum);
    }
}
