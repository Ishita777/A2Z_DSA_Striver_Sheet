package Recursion;

import java.util.Scanner;

public class Factorial {

    private static int calcFactorial(int fact, int num) {
        if(num == 1)
            return 1;
        return num * calcFactorial(fact, num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int fact = 1;
        fact = calcFactorial(fact, num);

        System.out.println("The factorial of " + num + " is " + fact);
    }



}
