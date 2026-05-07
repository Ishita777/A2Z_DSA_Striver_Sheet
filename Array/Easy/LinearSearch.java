package Array.Easy;

import Utilties.Utility;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {

    private static int linearSearch(ArrayList<Integer> nums, int eleToFind, int sizeOfArray) {
        for(int i = 0; i < sizeOfArray; ++i) {
            if(nums.get(i) == eleToFind) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();

        Utility utilObj = new Utility(sc);
        ArrayList<Integer> nums = utilObj.createIntList(sizeOfArray);

        utilObj.printArray(nums);

        int eleToFind = sc.nextInt();
        int ind = linearSearch(nums, eleToFind, sizeOfArray);
        System.out.println( ind == - 1 ? "Element not found in the array." :
                "Element found in the array at index : " + ind);

    }

}
