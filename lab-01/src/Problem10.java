public class Problem10 {
    public static void main(String[] args) {
        int currentPop = 312032486;
        int secondsPerYear = 365*24*60*60;
        int birthPerYear= secondsPerYear/7;
        int deathPerYear= secondsPerYear/13;
        int immigrantsPerYear= secondsPerYear/45;
        int newPop= birthPerYear-deathPerYear+immigrantsPerYear;

        currentPop+= newPop;
        System.out.println("Population after 1 year: "+currentPop);

        for (int i=2; i<6; i++){
            currentPop+=newPop;
            System.out.println("Population after "+i+" years: "+currentPop);
        }
    }
}
