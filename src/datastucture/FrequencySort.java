package datastucture;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencySort {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 3, 4, 4, 5, 5, 5, 5, 6, 6, 6};

        Map<Integer, Integer> tempmap = new TreeMap<>();

        for (Integer i : arr) {
            int count = 1;
            if (tempmap.containsKey(i)) {
                count = tempmap.get(i);
                count++;
            }

            tempmap.put(i, count);

        }
        System.out.println(tempmap);

    }
}
