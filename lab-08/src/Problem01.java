import java.util.Scanner;
public class Problem01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[][] m = new int[3][4];

        System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = inp.nextInt();
            }
        }

        System.out.println("\nSum of all elements is " + sum(m));
    }

    public static int sum(int[][] m) {
        int amount = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                amount += m[i][j];
            }
        }
        return amount;
    }
}
