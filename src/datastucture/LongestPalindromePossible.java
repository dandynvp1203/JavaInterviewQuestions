package datastucture;

public class LongestPalindromePossible {
    public static void main(String[] args) {
        String str = "abccccdd";

        //array of 128 to contains all characters
        final int[] counts = new int[128];
        for (char c : str.toCharArray()) {
            counts[c]++;
        }

        for (final int c: counts) {
            System.out.print(c + " ");
        }

        // characters with even count can all be used in a palindrome
        // for characters with odd count, half can be used in a palindrome
        // if current length is even, the 1 remaining character can be put in the middle
        // if current length is odd, we cant do anything

        int maxLength = 0;
        for (final int c: counts) {
            maxLength += c/2*2;
            if(maxLength%2 ==0 && c%2 == 1) {
                maxLength++;
            }
        }

        System.out.print("\n " + maxLength);
    }
}
