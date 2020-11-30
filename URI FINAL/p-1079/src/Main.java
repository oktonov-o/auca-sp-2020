import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        for (int i=0; i<t; i++){
            double num1 = inp.nextDouble();
            double num2 = inp.nextDouble();
            double num3 = inp.nextDouble();

            double average = (num1*2 + num2*3 + num3*5)/10;
            System.out.printf("%.1f%n", average);
        }
    }
}
