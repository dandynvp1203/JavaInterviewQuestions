package two_d_array;

import java.util.ArrayList;
import java.util.List;

public class PrintSpirally {

    public static void main (String[] args) {
        List<Integer> myList = new ArrayList<>();
        int[][] array = {{1,43,23,56, 16}, {32, 12, 54, 65, 0}, {54, 76, 23, 31, 8}, {22, 12, 33, 54, 61}};

        int[][] array1 = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j]);
            }
        }

        System.out.print('\n');

        // 1    32  54  22
        // 43   12  76  12
        // 23   54  23  33
        // 56   65  31  54
        // 16   0   8   61

        printSpirally(array, myList);
    }

    private static List<Integer> printSpirally(int[][] array, List<Integer> myList) {
        int currentRow = 0, currentColumn = 0;
        int rangeUp = 0;
        int rangeRight = array.length;
        int rangeDown = array[0].length, rangeLeft = 0;

        while(rangeLeft < rangeRight && rangeUp < rangeDown) {
            if (currentColumn == 0&& currentRow == 0) {
                System.out.print(array[currentColumn][currentRow] + " ");
                myList.add(array[currentColumn][currentRow]);
            }
            currentColumn = printRight(currentRow, currentColumn+1, rangeRight, array, myList);
            rangeUp += 1;
            currentRow = printDown(currentRow+1, currentColumn, rangeDown , array, myList);
            rangeRight -= 1;
            currentColumn = printLeft(currentRow, currentColumn-1, rangeLeft, array, myList);
            rangeDown -= 1;
            currentRow = printUp(currentRow-1, currentColumn, rangeUp, array, myList);
            rangeLeft += 1;
        }

        System.out.println('\n');
        System.out.println(myList);

        return myList;
    }

    private static int printRight(int currentRow, int currentColumn, int endColumnIndex, int[][] array, List<Integer> myList) {
        while(currentColumn < endColumnIndex) {
            System.out.print(array[currentColumn][currentRow] + " ");
            myList.add(array[currentColumn][currentRow]);
            currentColumn++;
        }
        currentColumn--;
        return currentColumn;
    }

    private static int printDown(int currentRow, int currentColumn, int endRowIndex, int[][] array, List<Integer> myList) {
        while(currentRow < endRowIndex) {
            System.out.print(array[currentColumn][currentRow] + " ");
            myList.add(array[currentColumn][currentRow]);
            currentRow++;
        }
        currentRow--;
        return currentRow;
    }

    private static int printLeft(int currentRow, int currentColumn, int endColumnIndex, int[][] array, List<Integer> myList) {
        while(currentColumn >= endColumnIndex) {
            System.out.print(array[currentColumn][currentRow] + " ");
            myList.add(array[currentColumn][currentRow]);
            currentColumn--;
        }
        currentColumn++;
        return currentColumn;
    }

    private static int printUp(int currentRow, int currentColumn, int endRowIndex, int[][] array, List<Integer> myList) {
        while(currentRow >= endRowIndex) {
            System.out.print(array[currentColumn][currentRow] + " ");
            myList.add(array[currentColumn][currentRow]);
            currentRow--;
        }
        currentRow++;
        return currentRow;
    }
}
