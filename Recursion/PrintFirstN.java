package Recursion;
import java.util.*;

public class PrintFirstN {

    private static void printFirstNNumbers(int num, int n) {
        if (n > num)
            return;
        System.out.println(num);
        printFirstNNumbers(num+1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFirstNNumbers(1, n);
    }

}
