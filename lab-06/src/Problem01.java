import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("The coordinate of your point: ");
        int x0 = inp.nextInt();

        System.out.print("The coordinate of 1st point: ");
        int x1 = inp.nextInt();

        System.out.print("The coordinate of 2nd point: ");
        int x2 = inp.nextInt();

        int d1 = Math.abs(x1 - x0);
        int d2 = Math.abs(x2 - x0);

        if (d1 < d2){
            System.out.println("1st point is closer. Distance is " + d1);
        } else if (d1 > d2){
            System.out.println("2nd point is closer. Distance is " + d2);
        } else {
            System.out.println("Distances are the same and equal to " + d1);
        }
    }
}