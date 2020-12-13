import java.util.Random;

public class Problem04 {
    public static void main(String[] args) {
        Random rnd = new Random();

        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};

        for (int i=0; i<4; i++){
            int n = rnd.nextInt(51)+1;
            System.out.printf("Card number %d: %s of %s%n", n, ranks[n%13], suits[n/13]);
        }
    }
}