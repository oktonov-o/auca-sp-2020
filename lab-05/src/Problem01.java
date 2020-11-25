import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double num, sum=0;
        int cnt=0;
        while (inp.hasNext()) {
            num = inp.nextDouble();
            if(num==0){
                break;
            }
            sum += num;
            cnt++;
        }
        if (cnt > 0){
            System.out.println("The arithmetic mean is " + sum/cnt);
        } else {
            System.out.println("Nothing to calculate");
        }
    }
}
