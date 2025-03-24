package leetcode;

import java.util.Stack;

public class StackProblem
{
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Push opening brackets to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Check for closing brackets
            else {
                if (stack.isEmpty()) {
                    return false; // Closing bracket without opening
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false; // Mismatched bracket
                }
            }
        }

        return stack.isEmpty(); // Stack should be empty if balanced
    }

    public static void main(String[] args) {
        String s = "[()()]{}";
        System.out.println("Is the string balanced? " + isValid(s)); // Output: true

        String s2 = "[({})](]";
        System.out.println("Is the string balanced? " + isValid(s2)); // Output: false
    }
}
