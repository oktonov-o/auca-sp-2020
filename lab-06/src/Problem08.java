import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int n = inp.nextInt();

        displayPattern(n);
    }

    private static int displayPattern(int n) {
        for (int i=1; i<=n; i++){
            for (int j=n; j>0; j--){
                if (j <= i){
                    System.out.printf("%3d",j);
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        return 0;
    }
}
