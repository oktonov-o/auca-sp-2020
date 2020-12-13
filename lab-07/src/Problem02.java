import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 30};

        System.out.print("Month: ");

        while (true){

            System.out.print("Month: ");
            int month = inp.nextInt();
            if (!inp.hasNext()){
                break;
            }
            System.out.print("Year: ");
            int year = inp.nextInt();
            if (!inp.hasNext()){
                break;
            }

            if (year % 4==0 && year % 100 != 0 || year%400==0){
                days[1]=29;
            }

            System.out.println("Days: "+ days[month-1]);
        }
    }
}
