import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] myArr = new int[5];

        for (int i=0; i<5; i++){
            System.out.printf("Enter %d element: ", i);
            myArr[i] = inp.nextInt();
        }

        printArray(myArr);
        reverseArray(myArr);
        printArray(myArr);
    }

    private static void reverseArray(int[] myArr) {
        int[] temp = new int[5];
        for (int i=0; i<5; i++){
            temp [i] = myArr[i];
        }
        for (int i=0; i<5; i++){
            myArr [i] = temp[4-i];
        }
    }

    private static void printArray(int[] myArr) {
        for (int i=0; i<5; i++){
            System.out.print(myArr[i]+" ");
        }
        System.out.println();

    }
}
