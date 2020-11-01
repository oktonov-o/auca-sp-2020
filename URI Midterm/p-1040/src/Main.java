import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        double d = inp.nextDouble();
        double media = (a+b+c+d)/4;

        System.out.printf("Media: %.1f%n", media);

        if(media >= 7.0){
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0){
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            System.out.print("Nota do exame: ");
            double exam = inp.nextDouble();
            media = (media + exam)/2;
            if(media >=5.0){
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", media);
        }
    }
}
