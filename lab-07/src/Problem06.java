import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStudents = inp.nextInt();

        int[] scores = new int[numOfStudents];

        System.out.print("Enter "+numOfStudents+" scores: ");

        for (int i=0; i<scores.length; i++){
            scores[i] = inp.nextInt();
        }

        printGrades(scores);
    }

    private static void printGrades(int[] scores) {
        for (int i = 0; i< scores.length; i++){
            System.out.printf("Student %d score is %d and grade is %s%n", i, scores[i], getGrade(scores[i], maxScore(scores)));
        }
    }

    private static String getGrade(int score, int max) {
        if (max-score <= 10){
            return "A";
        } else if (max-score <= 20){
            return "B";
        } else if (max-score <= 30){
            return "C";
        } else if (max-score <= 40){
            return "D";
        } else {
            return "F";
        }
    }

    private static int maxScore(int[] scores) {
        int max = 0;
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }
}
