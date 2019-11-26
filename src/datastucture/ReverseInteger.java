package datastucture;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseInteger {

    public static void main(String[] args) {
        int x = 123;
        reverseInteger(123);
        reverseInteger2(123);
    }

    private static void reverseInteger2(int x) {
        int result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x/10;
        }
        System.out.println("Reversed Integer: " + result);
    }

    private static void reverseInteger(int x) {
        int multiplier = 1;
        Queue<Integer> queue = new LinkedList<>();
        int reverse = 0;
        while(x != 0) {
            int remainder = x%10;
            queue.add(remainder);
            x = (x - remainder)/10;
            multiplier*=10;
        }

        multiplier = multiplier/10;
        while(!queue.isEmpty()) {
            int temp = queue.poll();
            reverse += temp*multiplier;
            multiplier = multiplier/10;
        }

        System.out.println(reverse);
    }
}
