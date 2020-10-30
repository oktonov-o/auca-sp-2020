import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Month? ");
        int month = inp.nextInt();
        if (month == 12 || month == 1 || month == 2){
            System.out.println("winter");
        } else if (month == 3 || month == 4 || month == 5){
            System.out.println("spring");
        } else if (month == 6 || month == 7 || month == 8){
            System.out.println("summer");
        } else {
            System.out.println("fall");
        }
    }
}
