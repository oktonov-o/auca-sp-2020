import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String first = inp.nextLine();
        String second = inp.nextLine();
        String third = inp.nextLine();
        String animal;
        if (first.equals("vertebrado")){
            if (second.equals("ave")){
                if (third.equals("carnivoro")){
                    animal = "aguia";
                } else {
                    animal = "pomba";
                }
            } else {
                if (third.equals("onivoro")){
                    animal = "homem";
                } else {
                    animal = "vaca";
                }
            }
        } else {
            if (second.equals("inseto")){
                if (third.equals("hematofago")){
                    animal = "pulga";
                } else {
                    animal = "lagarta";
                }
            } else {
                if (third.equals("hematofago")){
                    animal = "sanguessugo";
                } else {
                    animal = "minhoca";
                }
            }
        }
        System.out.println(animal);
    }
}
