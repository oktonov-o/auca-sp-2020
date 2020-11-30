import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int amount = 0;
        int typeC = 0;
        int typeR = 0;
        int typeS = 0;
        int t = inp.nextInt();

        for (int i = 0; i<t; i++){
            int num = inp.nextInt();
            char type = inp.next().charAt(0);
            amount += num;
            if (type == 'C'){
                typeC+=num;
            } else if (type == 'R'){
                typeR+=num;
            } else {
                typeS+=num;
            }
        }
        System.out.printf("Total: %d cobaias%n", amount);
        System.out.printf("Total de coelhos: %d%n", typeC);
        System.out.printf("Total de ratos: %d%n", typeR);
        System.out.printf("Total de sapos: %d%n", typeS);
        System.out.printf("Percentual de coelhos: %.2f %%", (typeC*100f)/amount);
        System.out.println();
        System.out.printf("Percentual de ratos: %.2f %%", (typeR*100f)/amount);
        System.out.println();
        System.out.printf("Percentual de sapos: %.2f %%", (typeS*100f)/amount);
        System.out.println();

    }
}
//Total: 92 cobaias
//Total de coelhos: 29
//Total de ratos: 40
//Total de sapos: 23
//Percentual de coelhos: 31.52 %
//Percentual de ratos: 43.48 %
//Percentual de sapos: 25.00 %