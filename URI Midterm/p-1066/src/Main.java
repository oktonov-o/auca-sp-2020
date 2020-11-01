import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x, cntEven = 0, cntOdd = 0, cntPos = 0, cntNeg = 0;
        while (inp.hasNext()){
            x = inp.nextInt();
            if (x % 2 == 0){
                cntEven++;
            } else {
                cntOdd++;
            }
            if (x > 0){
                cntPos++;
            } else if (x < 0){
                cntNeg++;
            }
        }
        System.out.println(cntEven + " valor(es) par(es)");
        System.out.println(cntOdd + " valor(es) impar(es)");
        System.out.println(cntPos + " valor(es) positivo(s)");
        System.out.println(cntNeg + " valor(es) negativo(s)");
    }
}
