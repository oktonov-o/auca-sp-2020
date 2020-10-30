import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Month? ");
        int month = inp.nextInt();
        String season = null;
        switch (month){
            case 12:
            case 1:
            case 2: season="winter";
            break;
            case 3:
            case 4:
            case 5: season="spring";
            break;
            case 6:
            case 7:
            case 8: season="summer";
            break;
            case 9:
            case 10:
            case 11: season="fall";
            break;
        }
        System.out.println(season);
    }
}
