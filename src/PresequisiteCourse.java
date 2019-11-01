import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PresequisiteCourse {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> courses
                = new HashMap<String, ArrayList<String>>();
        courses.put("CSC400", new ArrayList<String>(Arrays.asList("CSC100")));
        courses.put("CSC300", new ArrayList<String>(Arrays.asList("CSC100", "CSC200")));
        courses.put("CSC200", new ArrayList<String>(Arrays.asList("CSC100")));
        courses.put("CSC100", new ArrayList<String>());

        boolean delete = true;
        while (courses.size() != 0 && delete) {
            String key = "";
            delete = false;
            //      find the first key in hash map with empty array value
            for (Map.Entry<String, ArrayList<String>> elem : courses.entrySet()) {
                ArrayList<String> values = elem.getValue();
                if (values.isEmpty()) {
                    key = elem.getKey();
                    delete = true;
                    System.out.print("" + elem.getKey() + " ");
                    break;
                }
            }

            //      remove the key from array list value stored in each key
            if (delete) {
                for (Map.Entry<String, ArrayList<String>> elem : courses.entrySet()) {
                    ArrayList<String> values = elem.getValue();
                    if (!values.isEmpty()) {
                        elem.getValue().remove(key);
                    }
                }
            }

            //      remove the key from hash map
            courses.remove(key);
        }
    }
}
