import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double x, y, z, n;
        y = 0;
        z = 0;
        n = 0;
        while(inp.hasNext()){
            x = inp.nextDouble();
            if(n == 1){

                if(x == 2){
                    break;
                }else if(x == 1){
                    n = 0;
                    continue;
                }
                else{
                    System.out.println("novo calculo (1-sim 2-nao)");
                    continue;
                }
            }else{
                if(x < 0 || x > 10){
                    System.out.println("nota invalida");
                }
                else if(z == 0){
                    y = x;
                    z = 1;
                }
                else{
                    System.out.printf("media = %.2f%n", (x+y)/2.00);
                    z = 0;
                    n = 1;
                }
            }

            if(n == 1)
                System.out.println("novo calculo (1-sim 2-nao)");

        }
    }
}
