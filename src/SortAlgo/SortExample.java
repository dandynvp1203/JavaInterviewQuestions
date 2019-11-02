package SortAlgo;

public class SortExample {

    public static void main(String[] args) {
        int[] array = {5, 6, 1, 54, 23, 45, 63, 23, 43, 27, 7};

        QuickSort.quickSort(array, 0, array.length-1);

        printArray(array);
    }

    public static void printArray(int[] array) {
        System.out.print('\n');
        for (int item: array) {
            System.out.print(" " + item +" ");
        }
        System.out.print('\n');
    }
}
