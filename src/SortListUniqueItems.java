import java.util.HashMap;
import java.util.Map;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class SortListUniqueItems {

    public static void main(String args[]) {
        int[] array = new int[] {1,2,3,3,3,2,2,1,1,1,1,1};
        sortUnique(array);
    }

    private static void sortUnique(int[] array) {
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();

        for (int item: array) {
            if (!myMap.containsKey(item)) {
                myMap.put(item, 1);
            } else {
                int value = myMap.get(item);
                myMap.put(item, value+1);
            }
        }

        System.out.print(myMap);
    }
}
