import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double[] point = new double[4];
        double x1,x2,y1,y2;
        int i=0;
        while (inp.hasNext()){
            point[i] = inp.nextDouble();
            i++;
        }
        x1 = point[0];
        y1 = point[1];
        x2 = point[2];
        y2 = point[3];
        double ans = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.printf("%.4f%n", ans);
    }
}
