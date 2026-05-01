package Array.Easy;

import Utilties.Utility;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CheckIfArraySorted {

//    private static void checkIfArraySorted(ArrayList<Integer> numArr, int sizeOfArr) {
//
//        ArrayList<Integer> numArrSortedAsc = new ArrayList<>(numArr);
//        numArrSortedAsc.sort(null);
//
//        ArrayList<Integer> numArrSortedDesc = new ArrayList<>(numArr);
//        numArrSortedDesc.sort(Comparator.reverseOrder());
//
//        if(numArrSortedAsc.equals(numArr) || numArrSortedDesc.equals(numArr)) {
//            System.out.println("sorted array");
//        } else {
//            System.out.println("unsorted array");
//
//        }
//
//    }


    private static void checkIfArraySorted(ArrayList<Integer> numArray, int sizeOfArr) {

        for(int i = 0; i < sizeOfArr - 1; ++i) {

            if(numArray.get(i) >= numArray.get(i+1)) {
                System.out.println("Unsorted array");
                return;
            }

        }

        System.out.println("Sorted array");

    }

    public static void main(String[] main) {

        Scanner sc = new Scanner(System.in);

        int sizeOfArr = sc.nextInt();

        Utility utilObj = new Utility(sc);

        ArrayList<Integer> numArr = utilObj.createIntList(sizeOfArr);

        utilObj.printArray(numArr);

        checkIfArraySorted(numArr, sizeOfArr);

    }

}
