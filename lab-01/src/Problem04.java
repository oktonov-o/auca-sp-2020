import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("1st int? ");
        int firstInt = inp.nextInt();
        System.out.print("2nd int? ");
        int secondInt = inp.nextInt();
        System.out.print(firstInt+" + "+secondInt+" = ");System.out.println(firstInt+secondInt);
        System.out.print(firstInt+" - "+secondInt+" = ");System.out.println(firstInt-secondInt);
        System.out.println(firstInt+" * "+secondInt+" = "+firstInt*secondInt);
        System.out.println(firstInt+" / "+secondInt+" = "+1.0*firstInt/secondInt);
        System.out.println(firstInt+" % "+secondInt+" = "+firstInt%secondInt);

    }
}
