import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double salary = inp.nextDouble();
        double newSalary, earned;
        String percent;
        if (salary <= 400.0){
            earned = salary * 0.15;
            newSalary = salary + earned;
            percent = "15 %";
        } else if (salary <= 800.0){
            earned = salary * 0.12;
            newSalary = salary + earned;
            percent = "12 %";
        } else if (salary <= 1200.0){
            earned = salary * 0.1;
            newSalary = salary + earned;
            percent = "10 %";
        } else if (salary <= 2000.0){
            earned = salary * 0.07;
            newSalary = salary + earned;
            percent = "7 %";
        } else {
            earned = salary * 0.04;
            newSalary = salary + earned;
            percent = "4 %";
        }
        System.out.printf("Novo salario: %.2f%n", newSalary);
        System.out.printf("Reajuste ganho: %.2f%n", earned);
        System.out.println("Em percentual: " + percent);
    }
}
