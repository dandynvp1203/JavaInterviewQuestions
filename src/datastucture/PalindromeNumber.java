package datastucture;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeNumber {
    
    public static void main(String[] args) {
        
        int x = 1441;
        int y = 1234322;
        
        System.out.println(validatePalindrome(y));
        System.out.println(validatePalindromeTwo(x));
    }

    private static int reverseInteger(int x) {
        int result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x/10;
        }
        return result;
    }

    private static boolean validatePalindromeTwo(int x) {
        return (reverseInteger(x) == x);
    }

    private static boolean validatePalindrome(int x) {
        int original = x;
        int multiplier = 1;
        int reverse = 0;
        Queue<Integer> queue = new LinkedList<>();

        while(x != 0) {
            int remainder = x%10;
            queue.add(remainder);
            x = (x-remainder)/10;
            multiplier *= 10;
        }

        multiplier = multiplier/10;
        while(!queue.isEmpty()) {
            int temp = queue.poll();
            reverse += temp*multiplier;
            multiplier = multiplier/10;
        }

        return (reverse == original);
    }
}
