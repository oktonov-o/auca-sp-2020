import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] num= new int[3];
        int i=0;
        while (inp.hasNext()){
            num[i]=inp.nextInt();
            i++;
        }
        if (num[0]>=num[1] && num[0]>=num[2]){
            System.out.println(num[0]+" eh o maior");
        } else if (num[1]>=num[0] && num[1]>=num[2]){
            System.out.println(num[1]+" eh o maior");
        } else {
            System.out.println(num[2]+" eh o maior");
        }
    }
}
