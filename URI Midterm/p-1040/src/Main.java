import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float a = inp.nextFloat();
        float b = inp.nextFloat();
        float c = inp.nextFloat();
        float d = inp.nextFloat();
        float median = (a*2+b*3+c*4+d)/10;

        System.out.printf("Media: %.1f%n", median);

        if(median >= 7.0){
            System.out.println("Aluno aprovado.");
        } else if (median <= 4.9){
            System.out.println("Aluno reprovado.");
        } else if (median <= 6.9 && median >= 5.0) {
            System.out.println("Aluno em exame.");
            System.out.print("Nota do exame: ");
            float exam = inp.nextFloat();
            median = (median + exam)/2;
            if(median >= 5.0){
                System.out.println("Aluno aprovado.");
            } else if(median <= 4.9) {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", median);
        }
    }
}
