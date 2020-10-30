import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Year? ");
        int year = inp.nextInt();
        System.out.print("Month? ");
        int month = inp.nextInt();
        int days;
        if(month ==1 || month==3 || month ==5 || month ==7 || month ==8 || month==10 || month==12){
            days =31;
        } else if(month ==4 || month==6 || month ==11 || month ==9){
            days =30;
        } else if (year%4==0 && year%100!=0 && month==2 || year %400 ==0 && month == 2){
            days =29;
        } else {
            days =28;
        }
        System.out.println("Number of days: "+ days);
    }
}
