import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int cnt = 0;
        double x, sum = 0;
        while (inp.hasNext()){
            x = inp.nextDouble();
            if (x>0){
                cnt++;
                sum += x;
            }
        }
        System.out.println(cnt + " valores positivos");
        System.out.println(sum/cnt);
    }
}
