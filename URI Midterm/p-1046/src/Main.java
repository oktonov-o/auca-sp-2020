import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int start = inp.nextInt();
        int finish = inp.nextInt();
        int time;
        if (start >= finish){
            time = 24+finish-start;
        } else {
            time = finish - start;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)%n", time);
    }
}
