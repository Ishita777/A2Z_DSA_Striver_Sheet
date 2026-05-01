package Sorting;

import Utilties.Utility;
import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {

    private static void selectionSort(ArrayList<Integer> numArr, int sizeOfArr) {

        for(int i = 0; i < sizeOfArr; ++i) {

            int minElement = numArr.get(i);
            int minElementInd = i;

            for(int j = i; j < sizeOfArr; ++j) {

                if(minElement >  numArr.get(j)) {
                    minElementInd = j;
                    minElement = numArr.get(j);
                }

            }

            if(i != minElementInd) {

                int temp = numArr.get(i);
                numArr.set(i, numArr.get(minElementInd));
                numArr.set(minElementInd, temp);

            }

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Utility utilObj = new Utility(sc);

        int sizeOfArr = sc.nextInt();

        ArrayList<Integer> numArr = utilObj.createIntList(sizeOfArr);

        System.out.println("Before sorting:");
        utilObj.printArray(numArr);

        selectionSort(numArr, sizeOfArr);

        System.out.println("After sorting:");
        utilObj.printArray(numArr);
    }

}


