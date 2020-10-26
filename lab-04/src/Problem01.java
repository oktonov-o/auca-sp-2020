public class Main {

  public static void main(String[] args) {
        double d = 0.1;
        double sum = 1e-16 +d+d+d+d+d+d+d+d+d+d;
        if (sum == 1.0){
          System.out.println("Equal");
        } else {
          System.out.println("Not equal");
        }
  }
}
