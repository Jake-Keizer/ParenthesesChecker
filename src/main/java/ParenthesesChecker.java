import java.util.Scanner;
import java.util.Stack;

public class ParenthesesChecker {
   private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter code to validate");
        String code = keyboard.nextLine();
        if (validateCode(code)){
            System.out.println("Code is in proper format");
        } else {
            System.out.println("Go fix your code");
        }
    }

    public static boolean validateCode(String lispCode) {
        if (lispCode == null || lispCode.length() == 0) {
            return true;
        }
        char[] code = lispCode.toCharArray();
        Stack lispStack = new Stack<>();
        for (char c : code) {
            if (c == '(') {
                lispStack.push(c);
            } else if (c == ')') {
                if (lispStack.isEmpty() || !lispStack.peek().equals('(')) {
                    return false;
                } else lispStack.pop();
            }

        }
        return lispStack.isEmpty();
    }
}
