import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] rank = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String[] suit = {"Clubs","Diamonds","Hearts","Spades"};
        int i = (int)(Math.random()*13);
        int j = (int)(Math.random()*4);
        System.out.println("The card you picked is "+rank[i]+" of "+suit[j]);
    }
}
