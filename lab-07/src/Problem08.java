import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] myArr = new int[100];
        int i = 0, sum=0, above = 0, below = 0;

        System.out.println("Enter numbers: ");

        while (true){
            int x = inp.nextInt();

            if (x < 0){
                break;
            } else {
                myArr[i] = x;
                sum += x;
                i++;
            }
        }
        double average = 1.0*sum/i;
        for (int j=0; j<i; j++){
            if (myArr[j] >= average){
                above++;
            } else {
                below++;
            }
        }
        System.out.println(above+" numbers are above or equal to the average");
        System.out.println(below+" numbers are below the average");
    }
}
