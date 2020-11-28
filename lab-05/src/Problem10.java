public class Problem10 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int LINE_OF_PRIME_NUMBERS = 10;
        int cnt = 0, number = 2;

        while (cnt < NUMBER_OF_PRIMES){
            boolean isPrime = true;
            for (int div = 2; div*div <= number ; div++){
                if (number % div == 0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                cnt++;
                if (cnt % LINE_OF_PRIME_NUMBERS == 0){
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
            number++;
        }
    }
}
