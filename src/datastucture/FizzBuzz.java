package datastucture;

import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzz {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        for(int item: input) {
            if(item % 15 == 0 && item % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (item % 5 == 0) {
                System.out.print("Buzz ");
            } else if (item % 3 == 0) {
                System.out.print("Fizz ");
            } else {
                System.out.print(item + " ");
            }
        }
    }
}
