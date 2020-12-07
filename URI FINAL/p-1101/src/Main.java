import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int m, n;
        while (inp.hasNext()){
            int sum=0;
            m = inp.nextInt();
            n = inp.nextInt();
            if (m <= 0 || n <= 0){
                break;
            }
            if (m > n){
                int temp = m;
                m = n;
                n = temp;
            }
            for (int i = m; i<=n; i++){
                sum += i;
                System.out.print(i+" ");
            }
            System.out.println("Sum="+sum);
        }
    }
}
