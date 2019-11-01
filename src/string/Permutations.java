package string;

public class Permutations {

    public static void main(String[] args) {

        String str = "ABCD";
        //System.out.print(str.substring(1, 3));

        performPermutation(str, "");
    }

    private static void performPermutation(String str, String ans) {
        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String rest = str.substring(0, i) +
                    str.substring(i + 1);

            // Recurvise call
            performPermutation(rest, ans + ch);
        }
    }
}
