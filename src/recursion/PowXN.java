package recursion;

public class PowXN {

    public static void main(String[] args) {
        double x = 0.00001;
        int n = 2147483647;
        
        System.out.println(power(x, -n));
    }

    static double power(double x, int y) {
        if (x <= -100 || x >= 100 || y > Integer.MAX_VALUE || y < Integer.MIN_VALUE) {
            return x;
        }

        if (y == 0)
            return 1;
        else if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        else
            return x * power(x, y / 2) * power(x, y / 2);
    }


    private static double pow(double x, int n) {
        double result = 1;
        if (x <= -100 || x >= 100 || n > Integer.MAX_VALUE || n < Integer.MIN_VALUE) {
            return x;
        }

        while (n != 0) {
            if (n > 0) {
                result = result*x;
                n--;
            } else {
                result = result/x;
                n++;
            }
        }
        return result;
    }
}
