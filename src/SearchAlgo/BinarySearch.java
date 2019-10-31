package SearchAlgo;

import SortAlgo.BubbleSort;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 6, 7, 12, 17, 32, 23, 27, 21};
        int x = 32;
        int y = 9;

        BubbleSort.performBubbleSort(array);

//        for(int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

        doBinarySearch(array, x);
        doBinarySearch(array, 12);
        doBinarySearch(array, y);
    }

    private static void doBinarySearch(int[] array, int x) {
        boolean found = false;
        int startIndex = 0;
        int endIndex = array.length-1;
        int midIndex = array.length/2;

        while (!found && startIndex <= endIndex) {
            if(x == array[midIndex]) {
                found = true;
                System.out.println("Found value at: " + midIndex);
            } else if (x < array[midIndex]) {
                endIndex = midIndex-1;
                midIndex = (endIndex+startIndex)/2;
            } else {
                startIndex = midIndex+1;
                midIndex = (startIndex + endIndex)/2;
            }
        }

        if(!found) System.out.println("Not Found!");
    }
}
