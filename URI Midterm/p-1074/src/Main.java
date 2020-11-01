import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        String[] answer = new String[n];
        int x;
        for (int i=0; i<n; i++){
            x = inp.nextInt();
            if(x == 0){
                answer[i]="NULL";
            } else if (x % 2 ==0 && x > 0){
                answer[i]="EVEN POSITIVE";
            } else if (x % 2 ==0 && x < 0){
                answer[i]="EVEN NEGATIVE ";
            } else if (x > 0){
                answer[i]="ODD POSITIVE";
            } else {
                answer[i]="ODD NEGATIVE";
            }
        }
        for (int i=0; i<n; i++){
            System.out.println(answer[i]);
        }
    }
}
