package Recursion;

import java.util.Scanner;

public class CheckPalindrome {

    private static void checkIfPalindrome(String strVal, int leftIndex, int rightIndex) {

        if(leftIndex >= rightIndex){
            System.out.println(strVal + " is a Palindrome.");
            return;
        }


        if(strVal.charAt(leftIndex) != strVal.charAt(rightIndex)) {
            System.out.println(strVal + " is not a Palindrome.");
            return;
        }

        checkIfPalindrome(strVal, leftIndex + 1, rightIndex - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String strValue = sc.next();

        checkIfPalindrome(strValue, 0, strValue.length() - 1);

    }

}
