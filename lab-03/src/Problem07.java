import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] day = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.print("Enter today's day: ");
        int today = inp.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int days = inp.nextInt();
        System.out.println("Today is " + day[today] + " and the future day is " + day[days%7]);
    }
}
