import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};
        while (true){
            System.out.print("Month: ");
            if (!inp.hasNext()){
                break;
            }
            int month = inp.nextInt();

            System.out.print("Year: ");
            if (!inp.hasNext()){
                break;
            }
            int year = inp.nextInt();

            if (isLeap(year)){
                days[1]=29;
            }

            System.out.println(days[month-1]+" days");
        }
    }

    public static boolean isLeap(int year){
        if (year%4==0 && year%100!=0 || year%400==0){
            return true;
        }
        else {
            return false;
        }
    }
}
