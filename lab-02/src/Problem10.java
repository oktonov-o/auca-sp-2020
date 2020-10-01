import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = inp.nextInt();
        int currentPop = 312032486;
        final int secondsPerYear = 365*24*60*60;
        double birthPerYear= 1.0*secondsPerYear/7;
        double deathPerYear= 1.0*secondsPerYear/13;
        double immigrantsPerYear= 1.0*secondsPerYear/45;
        double newPop= birthPerYear-deathPerYear+immigrantsPerYear;

        currentPop+=(years * newPop);
        System.out.println("The population in "+years+" years is "+ currentPop);
    }
}
