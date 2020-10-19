import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] srp = {"scissor", "rock", "paper"};
        System.out.print("scissor (0), rock (1), paper (2): ");
        int player = inp.nextInt();
        int comp = (int) (Math.random() * 3);
        if (comp == player)
            System.out.println("The computer is " + srp[comp] + ". You are " + srp[player] + " too. It is a draw");
        else if (comp == 0 && player == 1 || comp == 1 && player == 2 || comp == 2 && player == 0)
            System.out.println("The computer is " + srp[comp] + ". You are " + srp[player] + ". You won");
        else
            System.out.println("The computer is " + srp[comp] + ". You are " + srp[player] + ". The computer won");
    }
}
