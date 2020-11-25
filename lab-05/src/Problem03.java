import java.util.*;

public class Problem03 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner inp = new Scanner(System.in);

        System.out.print("Number of test? ");
        int n = inp.nextInt();
        int cnt=0, i=0;
        while (i<n){
            int a = rnd.nextInt(101)-50;
            int b = rnd.nextInt(101)-50;
            if (b >= 0) {
                System.out.printf("%d+%d = ",a,b);
            } else {
                System.out.printf("%d%d = ",a,b);
            }
            int ans = inp.nextInt();
            if (a + b == ans){
                cnt++;
            }
            i++;
        }
        System.out.printf("Number of correct answers is %d%n",cnt);
        System.out.printf("Number of incorrect answers is %d%n",n - cnt);
    }
}
