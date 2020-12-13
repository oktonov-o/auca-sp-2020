import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double[][] a = new double[3][3];
        double[][] b = new double[3][3];

        System.out.print("Enter matrix1: ");
        for (int i=0; i<a.length; i++){
            for (int j=0; j<b[i].length; j++){
                a[i][j] = inp.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        for (int i=0; i<b.length; i++){
            for (int j=0; j<b[i].length; j++){
                b[i][j] = inp.nextDouble();
            }
        }

        double[][] c = multipleMatrices(a ,b);

        System.out.println("The multiplication of the matrices is");

        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[0].length; j++){
                System.out.print(a[i][j]+"  ");
            }
            if (i==a.length/2){
                System.out.print("     *    ");
            } else {
                System.out.print("          ");
            }

            for (int j=0; j<b[0].length; j++){
                System.out.print(b[i][j]+"  ");
            }

            if (i==a.length/2){
                System.out.print("     =    ");
            } else {
                System.out.print("          ");
            }

            for (int j=0; j<c[0].length; j++){
                System.out.printf("%.1f  ",c[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] multipleMatrices(double[][] a, double[][] b){
        double[][] c = new double[a.length][a[0].length];
        for (int i=0; i< a.length; i++){
            for (int j=0; j<a[0].length; j++){
                c[i][j] = a[i][0]*b[0][j]+a[i][1]*b[1][j]+a[i][2]*b[2][j];
            }
        }
        return c;
    }
}
