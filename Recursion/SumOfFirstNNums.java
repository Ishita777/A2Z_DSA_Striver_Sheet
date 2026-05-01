package Recursion;

import java.util.Scanner;

public class SumOfFirstNNums {

    private static int sumOfFirstNNumbers(int sum, int n) {
        if(n == 0)
            return sum;
        return sumOfFirstNNumbers(sum + n, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        sum = sumOfFirstNNumbers(sum, n);
        System.out.println("Sum of first " + n + " numbers = " + sum);

    }

}
