public class problem09 {
    public static void main(String[] args) {
        double pi=0;
        double pi_v2=0;

        for (double i=1; i<10; i=i+4){
            pi+=(1/i);
        }
        for (double j=3; j<12;j=j+4){
            pi -=(1/j);
        }
        System.out.println("1) Pi = "+(4*pi));

        for (double i=1; i<14; i=i+4){
            pi_v2+=(1/i);
        }
        for (double j=3; j<12;j=j+4){
            pi_v2 -=(1/j);
        }
        System.out.println("2) Pi = "+(4*pi_v2));
    }
}
