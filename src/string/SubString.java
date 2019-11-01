package string;

public class SubString {
    public static void main(String[] args) {

        String str = "aaaabbaa";
        findPalindrome(str);
    }

    private static void findPalindrome(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            String sub = str.substring(i);
            for(int j = 0; j < str.length(); j++) {
                String pali = str.substring(j);
                pali = new StringBuilder(pali).reverse().toString();
                System.out.println("Pali: " + pali);
                if (sub.equals(pali) && sub.length() > result.length()) {
                    result = sub;
                }
                if (j == str.length()-1) {
                    break;
                }
            }
        }

        System.out.println("Longest palindrome: " + result);
    }
}
