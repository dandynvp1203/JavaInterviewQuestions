package string;

public class Immutable {

    public static void main(String[] args) {
        Integer a = new Integer(10);
        Integer b = new Integer(10);
        Integer c = 10;
        Integer d = 15;

        System.out.println(a == b);
        System.out.println(d == c);

        String str = "Hello, world";
        System.out.println(str.hashCode());
        str = "Hello";
        System.out.println(str.hashCode());
    }
}
