import java.util.Random;
import java.util.Scanner;

public class Problem01 {

    Scanner inp = new Scanner(System.in);
    Random rnd = new Random();

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("N: ");
        int num = inp.nextInt();

        int[] myArray = new int[11];

        for (int i = 0; i<num; i++){
            int first = 1+ rnd.nextInt(6);
            int second = 1+ rnd.nextInt(6);
            myArray[first+second-2]++;
        }
        for (int i = 0; i<11; i++){
            System.out.println((i+2)+": "+myArray[i]);
        }
    }
}
