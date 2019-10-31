import java.util.HashMap;
import java.util.Map;

public class HashMapTwoSum {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target  = 9;

        int[] result = findSum(array, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }

    private static void findSumHashMap(int[] array, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i: array) {
            if(!myMap.containsKey(array[i]));
        }
    }

    private static int[] findSum(int[] array, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return null;
    }
}
