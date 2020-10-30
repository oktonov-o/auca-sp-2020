import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Weight? ");
        double weight = inp.nextDouble();
        double cost = 0;
        if (weight <= 0 || weight > 50) {
            System.out.println("The package can not be shipped");
        } else if (weight <= 1) {
            cost = 3.5;
        } else if (weight <= 3) {
            cost = 5.5;
        } else if (weight <= 10) {
            cost = 8.5;
        } else if (weight <= 20) {
            cost = 10.5;
        } else if (weight <= 21) {
            cost = 10.5 + 3.5;
        } else if (weight <= 23) {
            cost = 10.5 + 5.5;
        } else if (weight <= 30) {
            cost = 10.5 + 8.5;
        } else if (weight <= 40) {
            cost = 10.5 * 2;
        } else if (weight <= 41) {
            cost = 10.5 * 2 + 3.5;
        } else if (weight <= 43) {
            cost = 10.5 * 2 + 5.5;
        } else {
            cost = 10.5 * 2 + 8.5;
        }
        System.out.println("Cost: $" + cost);
    }
}
