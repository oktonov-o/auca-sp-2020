import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = inp.nextLine();

        int min = 0, max = word.length()-1;
        boolean isPal = true;

        while (min < max){
            if (word.charAt(min) != word.charAt(max)){
                isPal = false;
                break;
            }
            min++;
            max--;
        }
        if (isPal){
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
