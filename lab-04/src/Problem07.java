import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] lottery = {1,2,3};
        int[] user = new int[3];
        int cnt = 0;
        System.out.print("Digits? ");
        int n = inp.nextInt();
        user[0] = n/100;
        n%=100;
        user[1] = n/10;
        user[2] = n%10;
        for (int i=0; i<3; i++){
            for ( int j=0; j<3; j++){
                if(lottery[i] == user[j]){
                    cnt++;
                    break;
                }
            }
        }
        if (lottery[0]==user[0] && lottery[1]==user[1] && lottery[2]==user[2]){
            System.out.println("Your award is $10,000");
        } else if (cnt == 3){
            System.out.println("Your award is $3,000");
        } else if (cnt > 0){
            System.out.println("Your award is $1,000");
        } else {
            System.out.println("Your award is $0.0");
        }
    }
}
