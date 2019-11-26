package datastucture;

import java.util.ArrayList;

public class SubArrayProduct {
    static int countSubArrayProductLessThanK(ArrayList<Integer> a, long k) {
        int n = a.size();
        long p = 1;
        int res = 0;
        for (int start = 0, end = 0; end < n; end++) {

            // Move right bound by 1 step.
            // Update the product.
            p *= a.get(end);

            // Move left bound so guarantee that
            // p is again less than k.
            while (start < end && p >= k)
                p /= a.get(start++);

            // If p is less than k, update the counter.
            // Note that this is working even for
            // (start == end): it means that the
            // previous window cannot grow anymore
            // and a single array element is the only
            // addendum.
            if (p < k) {
                int len = end - start + 1;
                res += len;
            }
        }

        return res;
    }

    // Driver Function to count number of
// such arrays
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer> ();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(
                countSubArrayProductLessThanK(al, 10));

//        ArrayList<Integer> al1 = new ArrayList<Integer> ();
//        al1.add(1);
//        al1.add(9);
//        al1.add(2);
//        al1.add(8);
//        al1.add(6);
//        al1.add(4);
//        al1.add(3);
//        System.out.println(
//                countSubArrayProductLessThanK(al1, 100));
//
//        ArrayList<Integer> al2 = new ArrayList<Integer> ();
//        al2.add(5);
//        al2.add(3);
//        al2.add(2);
//        System.out.println(
//                countSubArrayProductLessThanK(al2, 16));
//
//        ArrayList<Integer> al3 = new ArrayList<Integer> ();
//        al3.add(100);
//        al3.add(200);
//        System.out.println(
//                countSubArrayProductLessThanK(al3, 100));
//
//        ArrayList<Integer> al4 = new ArrayList<Integer> ();
//        al4.add(100);
//        al4.add(200);
//        System.out.println(
//                countSubArrayProductLessThanK(al3, 101));
    }
}
