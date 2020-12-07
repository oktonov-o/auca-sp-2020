public class Main {
    public static void main(String[] args) {
        for (int j = 0; j<=10; j++){
            float i = 1 + j/5f;
            if ((int)i == i){
                System.out.println("I="+j/5+" J="+ (int)i);
                i = 2+ j/5f;
                System.out.println("I="+j/5+" J="+ (int)i);
                i = 3 + j/5f;
                System.out.println("I="+j/5+" J="+ (int)i);
            } else {
                System.out.println("I="+j/5f+" J="+ i);
                i = 2+ j/5f;
                System.out.println("I="+j/5f+" J="+ i);
                i = 3 + j/5f;
                System.out.println("I="+j/5f+" J="+ i);
            }
        }
    }
}