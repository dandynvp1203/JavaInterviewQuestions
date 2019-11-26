package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingWord {

    public static void main(String[] args) {

        String longString = "I am an Android Developer writing code right now";
        String shortString = "an Developer code now";

        printMissingWord(longString, shortString);
    }

    public static void printMissingWord(String longString, String shortString) {
        String[] parts = longString.replaceAll("[,.;-]", "").split("\\s");
        String[] otherparts = shortString.replaceAll("[,.;-]", "").split("\\s");
        List<String> missing = new ArrayList<>();
        int pnt = 0;
        for (int i=0; i < parts.length; ++i) {
            if (parts[i].equals(otherparts[pnt])) {
                ++pnt;
            }
            else {
                missing.add(parts[i]);
            }
        }

        System.out.println(Arrays.toString(parts));
        System.out.println(Arrays.toString(missing.toArray()));
    }
}
