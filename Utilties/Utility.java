package Utilties;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Utility {

    private final Scanner sc;

    public Utility(Scanner sc) {
        this.sc = sc;
    }

    private <T> ArrayList<T> createArrayList(int sizeOfArray, Function<String, T> parser) {
        ArrayList<T> arr = new ArrayList<>();
        for(int i = 0; i < sizeOfArray; ++i) {
            arr.add(parser.apply(sc.next()));
        }
        return arr;
    }

    public ArrayList<Integer> createIntList(int size) {
        return createArrayList(size, Integer::parseInt);
    }

    public ArrayList<String> createStringList(int size) {
        return createArrayList(size, s -> s);
    }

    public <T> void printArray(ArrayList<T> arr) {
        System.out.println("Elements in the list:");
        for(Object ele : arr) {
            System.out.println(ele);
        }
    }


}
