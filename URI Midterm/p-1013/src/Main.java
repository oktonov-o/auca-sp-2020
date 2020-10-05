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
        int a = num[0];
        int b = num[1];
        int c = num[2];
        if(a>b && a>c){
            System.out.println(a+" eh o maior");
        } else if(a<b && b>c){
            System.out.println(b+" eh o maior");
        } else {
            System.out.println(c+" eh o maior");
        }
    }
}
