import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int cnt=0;
        int[] ddd = {61, 71, 11, 21, 32, 19, 27, 31};
        String[] destination = {"Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora", "Campinas", "Vitoria", "Belo Horizonte"};
        int numberDDD = inp.nextInt();
        for (int i=0; i<8; i++){
            if (ddd[i]==numberDDD){
                System.out.println(destination[i]);
                break;
            } else {
                cnt++;
            }
        }
        if (cnt == 8){
            System.out.println("DDD nao cadastrado");
        }
    }
}
