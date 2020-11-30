import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int max = -1, index = 0;
        final int SIZE = 100;

        for (int i = 0; i<SIZE; i++){
            int x = inp.nextInt();
            if (x > max){
                max = x;
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
