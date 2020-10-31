import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double salary = inp.nextInt();
        if (salary <= 2000){
            System.out.println("Isento");
        } else if (salary <= 3000){
            salary = (salary - 2000) * 0.08;
            System.out.printf("R$ %.2f%n", salary);
        } else if (salary <= 4500){
            salary = (salary  - 3000) * 0.18 + 1000 * 0.08;
            System.out.printf("R$ %.2f%n", salary);
        } else {
            salary = (salary - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
            System.out.printf("R$ %.2f%n", salary);
        }
    }
}
