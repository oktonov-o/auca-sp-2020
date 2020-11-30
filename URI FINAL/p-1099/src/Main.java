import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        for (int i = 0; i<t; i++){
            int sum=0;
            int x = inp.nextInt();
            int y = inp.nextInt();
            if (x > y){
                int temp = x;
                x = y;
                y = temp;
            }
            if (x%2==0){
                for (int j = x+1; j<y; j+=2){
                    sum+=j;
                }
            } else {
                for (int j = x+2; j<y; j+=2) {
                    sum += j;
                }
            }
                System.out.println(sum);
        }
    }
}
