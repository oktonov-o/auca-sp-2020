import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i=0;
        double[] total = new double[6];
        while (inp.hasNext()){
             total[i]= inp.nextDouble();
             i++;
        }
        double sum= total[1]*total[2]+total[4]*total[5];
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", sum);
    }
}