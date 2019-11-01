package string;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        String[] array = str.split("\\.");

        StringBuilder result = new StringBuilder();
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
            if (i == 0) {
                result.append(array[i]);
            } else {
                result.append(array[i]).append('.');
            }
        }
        System.out.println("Reversed string is: " + result.toString());
    }
}
