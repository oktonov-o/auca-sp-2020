import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x, cnt = 0;
        while (inp.hasNext()){
            x = inp.nextInt();
            if (x % 2 == 0){
                cnt++;
            }
        }
        System.out.println(cnt + " valores pares");
    }
}
