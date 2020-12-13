import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double[] myArr = new double[100];
        int index = 0;

        while (inp.hasNext()){
            double x = inp.nextDouble();
            myArr[index] = x;
            index++;
        }

        int minIndex = indexOfSmallestElement(myArr, index);
        System.out.println("Index of smallest number: "+minIndex);
    }

    public static int indexOfSmallestElement(double[] myArr, int index) {
        double min = myArr[0];
        int minIndex=-1;

        for (int i = index -1; i>=0; i--){
            if (min >= myArr[i]){
                min = myArr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
