import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String first = inp.nextLine();
        String second = inp.nextLine();
        String third = inp.nextLine();
        if (first.equals("vertebrado")  && second.equals("ave") && third.equals("carnivoro")) {
            System.out.println("aguia");
        } else if (first.equals("vertebrado") && second.equals("ave") && third.equals("onivoro")) {
            System.out.println("pomba");
        } else if (first.equals("vertebrado") && second.equals("mamifero") && third.equals("onivoro")) {
            System.out.println("homem");
        } else if (first.equals("vertebrado") && second.equals("mamifero") && third.equals("herbivoro")) {
            System.out.println("vaca");
        } else if (first.equals("invertebrado") && second.equals("inseto") && third.equals("hematofago")) {
            System.out.println("pulga");
        } else if (first.equals("invertebrado") && second.equals("inseto") && third.equals("herbivoro")) {
            System.out.println("lagarta");
        } else if (first.equals("invertebrado") && second.equals("anelideo") && third.equals("hematofago")) {
            System.out.println("sanguessuga");
        } else if (first.equals("invertebrado") && second.equals("anelideo") && third.equals("onivoro")) {
            System.out.println("minhoca");
        }
    }
}
