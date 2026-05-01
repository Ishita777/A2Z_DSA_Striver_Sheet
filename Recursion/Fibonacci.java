package Recursion;

import java.util.Scanner;

public class Fibonacci {

    private static void fiboByRecursion(int numOfTerms, int a, int b) {

        if(numOfTerms == 0) {
            System.out.println(a);
            System.out.println(b);

            return;
        }

        System.out.println(a);

        fiboByRecursion(numOfTerms - 1, b, a + b);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numOfTerms = sc.nextInt();

        fiboByRecursion(numOfTerms - 2, 0, 1);

    }

}
