public class Problem09 {
    public static void main(String[] args) {

        System.out.println("i              m(i)");

        System.out.println("______________________");

        System.out.printf("1             %.4f%n", mthSeries(1));
        for (int i=101 ; i<=901; i+=100){
            System.out.printf("%d           %.4f%n", i, mthSeries(i));
        }
    }

    public static double mthSeries(int m) {
        double sum=0;
        for (int i=1; i<=m; i++){
            sum += Math.pow(-1, i+1)/(2*i-1);
        }
        return 4*sum;
    }
}
