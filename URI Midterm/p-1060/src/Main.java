import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double x;
        int cnt = 0;
        while (inp.hasNext()){
            x = inp.nextDouble();
            if (x>0){
                cnt++;
            }
        }
        System.out.println(cnt + " valores positivos");
    }
}
