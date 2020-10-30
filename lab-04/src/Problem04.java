import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("complexity level? ");
        int range = inp.nextInt();
        String level;
        if (range == 0){
            level = "a total newbie.";
        } else if ( range == 1){
            level = "a beginner.";
        } else if ( range == 2 || range == 3){
            level = "an experienced gamer.";
        } else {
            level = "a pro gamer.";
        }
        System.out.println("You are "+level);
    }
}
