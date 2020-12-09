import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Year: ");
        int year = inp.nextInt();

        System.out.print("Month: ");
        int month = inp.nextInt();

        System.out.println(getDaysOfMonth(year, month));
    }

    private static int getDaysOfMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        } else if (month == 2){
            if (isLeapYear(year)){
                return 29;
            } else {
                return 28;
            }
        } else {
            return 30;
        }
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        } else {
            return false;
        }
    }
}
