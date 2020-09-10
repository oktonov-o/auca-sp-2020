import java.util.Scanner;

public class problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("What is your name? ");
        String userName = inp.nextLine();
        System.out.println("Hello, "+userName+"!");
    }
}
