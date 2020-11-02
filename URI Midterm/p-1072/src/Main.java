import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int x, cntIn = 0, cntOut = 0;
        for (int i = 0; i < n; i++) {
            x = inp.nextInt();
            if (x >= 10 && x <= 20) {
                cntIn++;
            } else {
                cntOut++;
            }
        }
        System.out.println(cntIn + " in");
        System.out.println(cntOut + " out");
    }
}
