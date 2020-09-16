import java.util.Scanner;

public class problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("1st double? ");
        double firstDouble = inp.nextDouble();
        System.out.print("2nd double? ");
        double secondDouble = inp.nextDouble();
        System.out.print(firstDouble+" + "+secondDouble+" = ");System.out.println(firstDouble+secondDouble);
        System.out.print(firstDouble+" - "+secondDouble+" = ");System.out.println(firstDouble-secondDouble);
        System.out.println(firstDouble+" * "+secondDouble+" = "+firstDouble*secondDouble);
        System.out.println(firstDouble+" / "+secondDouble+" = "+firstDouble/secondDouble);
        System.out.println(firstDouble+" % "+secondDouble+" = "+firstDouble%secondDouble);

    }
}
