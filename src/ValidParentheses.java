import sun.rmi.runtime.Log;

import java.util.Stack;

import static sun.jvm.hotspot.debugger.win32.coff.DebugVC50X86RegisterEnums.TAG;

public class ValidParentheses {

    private static ParenthesisValidator parenthesisValidator;

    public static void main(String[] args) {
        String str = "()[]{}((({[]})))";
        parenthesisValidator = new ParenthesisValidator();
        parenthesisValidator.validateParentheses(str);

        parenthesisValidator.inputUserName("Pete", "Sheep");
    }

    public static class ParenthesisValidator {

        UserNameInput mUserNameInput;
        public boolean validateParentheses(String s) {
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

            if (valid) {
                System.out.println("Valid parentheses");
            }
            return valid;
        }

        public void inputUserName(String username, String password) {
            mUserNameInput = new UserNameInput("Pete", "Sheep");
            mUserNameInput.printUserName();
        }
    }

    public static class UserNameInput {

        private String userName;
        private String password;

        public UserNameInput(String username, String password) {
            this.userName = username;
            this.password = password;
        }

        public void printUserName() {
            System.out.print("Username: " + userName + ", Password: " + password);
        }
    }
}
