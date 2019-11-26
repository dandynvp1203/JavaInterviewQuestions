package SortAlgo;

public class SortExample {

    public static void main(String[] args) {
        int[] array = {5, 6, 1, 54, 23, 45, 63, 23, 43, 27, 7};

        QuickSort.quickSort(array, 0, array.length-1);

        printArray(array);

        int[] array1 = {5, 6, 1, 54, 23, 45, 63, 23, 43, 27, 7};

        HeapSort.sort(array1);

        printArray(array1);
    }

    public static void printArray(int[] array) {
        System.out.print('\n');
        for (int item: array) {
            System.out.print(" " + item +" ");
        }
        System.out.print('\n');
    }
}
