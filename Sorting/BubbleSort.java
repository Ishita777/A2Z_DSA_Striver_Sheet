package Sorting;

import Utilties.Utility;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {

    private static void bubbleSort(ArrayList<Integer> numArr) {
        int k = 0;
        for(int j = 0; j < numArr.size() - 1; ++j) {
            boolean swapped = false;

            for (int i = 0; i < numArr.size() - 1 - k; ++i) {
                if(numArr.get(i) > numArr.get(i+1)) {
                    int temp = numArr.get(i);
                    numArr.set(i, numArr.get(i+1));
                    numArr.set(i+1, temp);
                    swapped = true;
                }

            }
            k++;
            if(!swapped)
                break;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();

        Utility utilityObj = new Utility(sc);

        ArrayList<Integer> numArr = utilityObj.createIntList(sizeOfArray);

        utilityObj.printArray(numArr);

        bubbleSort(numArr);

        utilityObj.printArray(numArr);

    }
}
