package SearchAlgo;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 6, 7, 12, 17, 32, 23, 27, 21};
        int x = 32;
        int y = 9;

        doLinearSearch(array, x);
        doLinearSearch(array, y);
    }

    private static void doLinearSearch(int[] array, int value) {
        boolean result = false;
        for (int i = 0; i < array.length;  i++) {
            if (array[i] == value) {
                System.out.println("Value " + value + " found at index: " + i);
                result = true;
            }
        }
        if (!result) System.out.println("Value " + value + " not found");
    }
}
