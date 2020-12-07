import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for (int i=0; i<n; i++){
            double x = inp.nextDouble();
            double y = inp.nextDouble();
            if (y==0){
                System.out.println("divisao impossivel");
            } else {
                System.out.println(x/y);
            }
        }
    }
}
