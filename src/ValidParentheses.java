import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "()[]{}((({[]})))";

        validateParentheses(str);
    }

    public static void validateParentheses(String s) {
        char[] chArray = s.toCharArray();
        boolean valid = true;

        Stack<Character> myStack = new Stack<>();

        for (char ch: chArray) {
            if (ch == '(' || ch == '[' || ch == '{') {
                myStack.push(ch);
            } else {
                if ((ch == '}' && myStack.peek() == '{')
                        || (ch == ']' && myStack.peek() == '[')
                        || (ch == ')' && myStack.peek() == '(')) {
                    myStack.pop();
                } else {
                    System.out.println("Invalid parentheses");
                    valid = false;
                    break;
                }
            }
        }

        System.out.println(myStack);

        if (valid) System.out.println("Valid parentheses");
    }
}
