import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int days = inp.nextInt();
        int year = days/365;
        int month = days%365/30;
        days = days%365%30;
        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", year,month,days);
    }
}
