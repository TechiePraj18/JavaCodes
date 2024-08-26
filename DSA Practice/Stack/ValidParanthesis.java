package Stack;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the input string
        for (char c : s.toCharArray()) {

            // If the character is an opening parenthesis, push its corresponding closing
            // parenthesis onto the stack
            if (c == '(')
                stack.push(')');

            // If the character is an opening brace, push its corresponding closing brace
            // onto the stack
            else if (c == '{')
                stack.push('}');

            // If the character is an opening bracket, push its corresponding closing
            // bracket onto the stack
            else if (c == '[')
                stack.push(']');

            // If you get any other character than opening bracket, so we pop and compare
            // with that character
            // So if we get same element pop stack and continue.
            // If you don't get same equivalent character and stack is not empty return
            // false
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty(); // return true if stack is empty

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "({[})";

        boolean result = solution.isValid(s);
        System.out.println("Is paranthesis valid :" + result);
    }

}
