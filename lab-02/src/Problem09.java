import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = inp.nextInt();
        final int DAYS_IN_YEAR = 365;
        final int MINUTES_IN_DAY = 24*60;
        int days = minutes/MINUTES_IN_DAY;
        int years = days/DAYS_IN_YEAR;
        days %= DAYS_IN_YEAR;
        System.out.printf("%d minutes is approximately %d years and %d days%n", minutes, years, days);


    }
}
