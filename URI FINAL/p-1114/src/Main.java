import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        final String PASSWORD = "2002";
        String word;
        while (inp.hasNext()){
            word = inp.nextLine();
            if (word.equals(PASSWORD)){
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }
    }
}
