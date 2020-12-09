public class Problem10 {
    public static void main(String[] args) {

        System.out.println(" i         m(i)");

        System.out.println("_________________");

        for (int i=1 ; i<=20; i++){
            System.out.printf("%2d         %.4f%n", i, mthSeries(i));
        }
    }

    public static double mthSeries(int m) {
        double sum=0;
        for (int i=1; i<=m; i++){
            sum += 1.0*i/(i+1);
        }
        return sum;
    }
}
