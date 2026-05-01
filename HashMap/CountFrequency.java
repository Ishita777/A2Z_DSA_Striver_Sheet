package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sizeOfArr = sc.nextInt();

        int[] arr = new int[sizeOfArr];

        for(int i = 0; i < sizeOfArr; ++i ) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> mp = new HashMap<>();

        //Pre-compute step:
        for(int i : arr) {
            int freq = 0;
            if(mp.containsKey(i)) {
                freq = mp.get(i);
            }
            mp.put(i, freq + 1);
        }

        int maxFreq = 0, minFreq = 100000;
        int maxFreqElement = 0, minFreqElemnt = 0;

        for(Map.Entry<Integer, Integer> it : mp.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
            if(it.getValue() > maxFreq){
                maxFreq = it.getValue();
                maxFreqElement = it.getKey();
            }

            if(it.getValue() < minFreq) {
                minFreq = it.getValue();
                minFreqElemnt = it.getKey();
            }

        }

        System.out.println("Max Freq Element -> " +  maxFreqElement);
        System.out.println("Min Freq Element -> " +  minFreqElemnt);


    }

}
