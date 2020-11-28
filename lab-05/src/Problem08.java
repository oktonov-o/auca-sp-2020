public class Problem08 {
    public static void main(String[] args) {

        for (int i=1; i<12; i++){
            System.out.print(" ");
        }

        System.out.println("Multiplication Table");

        System.out.print("    ");
        for (int i = 1; i<=9; i++){
            System.out.print("   "+i);
        }
        System.out.println();

        for (int i=0; i<=9; i++){
            System.out.print("----");
        }
        System.out.println();

        for (int i = 1; i <= 9; i++){
            System.out.print(i + " | ");

            for (int j=1; j<=9; j++){
                if(i*j>9){
                    System.out.print("  "+i*j);
                } else {
                    System.out.print("   "+i*j);
                }
            }

            System.out.println();
        }
    }
}
