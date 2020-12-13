import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] list = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i< list.length; i++){
            list[i] = inp.nextInt();
        }
    }

    public static int[] eliminateDuplicates (int[] list){
    }
}
