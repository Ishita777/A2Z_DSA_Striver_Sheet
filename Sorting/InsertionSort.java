package Sorting;

import Utilties.Utility;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    private static void insertionSort(ArrayList<Integer> numArr, int sizeOfArr) {

        for(int i = 1; i < sizeOfArr; ++i) {

            int key = numArr.get(i);
            int j = i-1;
            while( j >= 0 && numArr.get(j) > key ) {

                numArr.set(j+1, numArr.get(j));
                --j;
            }

            numArr.set(j + 1, key);

        }

    }

    public static void main(String[] main) {

        Scanner sc = new Scanner(System.in);

        int sizeOfArr = sc.nextInt();

        Utility utilObj = new Utility(sc);

        ArrayList<Integer> numArr = utilObj.createIntList(sizeOfArr);

        System.out.println("Before sorting:");
        utilObj.printArray(numArr);

        insertionSort(numArr, sizeOfArr);

        System.out.println("After sorting:");
        utilObj.printArray(numArr);

    }

}

