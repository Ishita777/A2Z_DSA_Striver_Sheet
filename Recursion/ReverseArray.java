package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {

    private static void reverseArray(List<Integer> numsArray, int leftIndex, int rightIndex) {

        if(leftIndex >= rightIndex )
            return;


        int temp = numsArray.get(leftIndex);
        numsArray.set(leftIndex, numsArray.get(rightIndex));
        numsArray.set(rightIndex, temp);

        reverseArray(numsArray, leftIndex + 1, rightIndex - 1);

    }

    public static void main(String[] args) {
        List<Integer> numsArray = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();

        for(int i = 0; i < sizeOfArray; ++i) {
            numsArray.add(sc.nextInt());
        }

        System.out.println("Before reversal:");
        for(int i : numsArray) {
            System.out.println(i);
        }

        reverseArray(numsArray, 0, numsArray.size() - 1);

        System.out.println("After reversal:");

        for(int i : numsArray) {
            System.out.println(i);
        }

    }
}
