import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeTwoOverlapInterval {

    public static void mergeIntervals(Interval arr[]) {
        // Test if the given set has at least one interval
        if (arr.length <= 0)
            return;

        // Create an empty stack of intervals
        Stack<Interval> stack = new Stack<>();

        System.out.print("Intervals before sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].start + " " + arr[i].end + " - ");
        }
        System.out.print('\n');

        // sort the intervals in increasing order of start time
        Arrays.sort(arr, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });

        System.out.print("Intervals after sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].start + " " + arr[i].end + " - ");
        }
        System.out.print('\n');

        // push the first interval to stack
        stack.push(arr[0]);

        // Start from the next interval and merge if necessary
        for (int i = 1; i < arr.length; i++) {
            // get interval from stack top
            Interval top = stack.peek();

            // if current interval is not overlapping with stack top,
            // push it to the stack
            if (top.end < arr[i].start)
                stack.push(arr[i]);

                // Otherwise update the ending time of top if ending of current
                // interval is more
            else if (top.end < arr[i].end) {
                top.end = arr[i].end;
                stack.pop();
                stack.push(top);
            }
        }

        // Print contents of stack
        System.out.print("The Merged Intervals are: ");
        while (!stack.isEmpty()) {
            Interval t = stack.pop();
            System.out.print("[" + t.start + "," + t.end + "] ");
        }
    }

    public static void main(String args[]) {
        Interval arr[] = new Interval[4];
        arr[0] = new Interval(1, 3);
        arr[1] = new Interval(5, 8);
        arr[2] = new Interval(4, 10);
        arr[3] = new Interval(20, 25);
        mergeIntervals(arr);
    }

    static class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}


