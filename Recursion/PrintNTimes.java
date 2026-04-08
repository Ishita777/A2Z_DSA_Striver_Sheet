package Recursion;
import java.util.*;


public class PrintNTimes {

    private static void printName(String name, int count) {
        if(count == 0)
            return;
        System.out.println(name);
        printName(name, count - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printName("Ishita", n);
    }
}
