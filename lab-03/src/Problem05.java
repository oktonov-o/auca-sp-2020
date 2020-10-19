import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Number of points? ");
        int point = inp.nextInt();
        if (point > 100 || point < 0)
            System.out.printf("%d is not in the permitted range.%n", point);
        else if (point >= 90)
            System.out.println("Grade: A");
        else if (point >= 80)
            System.out.println("Grade: B");
        else if (point >= 70)
            System.out.println("Grade: C");
        else if (point >= 60)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
    }
}
