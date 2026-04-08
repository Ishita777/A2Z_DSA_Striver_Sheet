import java.util.*;

public class CheckPrimeNumber {


    private static boolean isPrimeNum(int num) {
        boolean isPrimeNum = true;

        for(int i = 2; i <= Math.sqrt(num); ++i) {
            if(num % i == 0) {
                return false;
            }
        }

        return isPrimeNum;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        boolean isPrime = isPrimeNum(num);
        System.out.println(isPrime);

        sc.close();
    }
}