import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double sum=0;
        int div=0;
        while (inp.hasNext()){
            double x = inp.nextDouble();
            if (x >= 0 && x <= 10){
                div++;
                sum += x;
                if (div == 2){
                    break;
                }
            } else {
                System.out.println("nota invalida");
            }
        }
        System.out.printf("media = %.2f%n",sum/div);
    }
}
