import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int seconds = inp.nextInt();
        int hours = seconds/60/60;
        int minutes = seconds/60%60;
        seconds %= 60;
        System.out.printf("%d:%d:%d%n", hours,minutes,seconds);
    }
}
