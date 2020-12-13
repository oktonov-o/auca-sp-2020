import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("N: ");
        int n = inp.nextInt();

        int[] myArr = new int[n];

        for (int i=0; i<myArr.length; i++){
            System.out.printf("Enter %d element: ", i);
            myArr[i] = inp.nextInt();
        }

        printArray(myArr);
        reverseArray(myArr);
        printArray(myArr);
    }

    private static void reverseArray(int[] myArr) {
        int[] temp = new int[myArr.length];
        for (int i=0; i< myArr.length; i++){
            temp [i] = myArr[i];
        }
        for (int i=0; i< myArr.length; i++){
            myArr [i] = temp[myArr.length-1-i];
        }
    }

    private static void printArray(int[] myArr) {
        for (int i=0; i<myArr.length; i++){
            System.out.print(myArr[i]+" ");
        }
        System.out.println();

    }
}
