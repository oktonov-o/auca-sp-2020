import java.util.Scanner;

public class Problem07 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] myArr = new int[100];
        for (int i=0; i<100; i++){
            myArr[i]=0;
        }

        System.out.print("Enter the integers between 1 and 100: ");
        while (true){
            int x = inp.nextInt();

            if (x == 0){
                break;
            } else {
                myArr[x]++;
            }
        }

        for (int i=0; i< myArr.length; i++){
            if (myArr[i]>0){
                System.out.printf("%d occurs %d time", i, myArr[i]);
                if (myArr[i]==1){
                    System.out.println();
                } else {
                    System.out.println("s");
                }
            }
        }
    }
}
