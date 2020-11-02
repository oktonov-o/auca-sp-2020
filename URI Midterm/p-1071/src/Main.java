import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int y = inp.nextInt();
        int sum = 0;
        if (y % 2 == 0) {
            for (int i = y + 1; i < x; i += 2) {
                sum += i;
            }
        } else {
            for (int i = y + 2; i < x; i += 2) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
