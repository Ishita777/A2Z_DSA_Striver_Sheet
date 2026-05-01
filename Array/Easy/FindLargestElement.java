package Array.Easy;

import Utilties.Utility;

import java.util.ArrayList;
import java.util.Scanner;

public class FindLargestElement {

    private static int largestElement(ArrayList<Integer> numArray) {

        int largestElement = -1;

        for(int i : numArray) {
            largestElement = Math.max(i, largestElement);
        }

        return largestElement;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sizeOfArr = sc.nextInt();

        Utility utilObj = new Utility(sc);
        ArrayList<Integer> numArr = utilObj.createIntList(sizeOfArr);

        System.out.println(largestElement(numArr));

    }

}
