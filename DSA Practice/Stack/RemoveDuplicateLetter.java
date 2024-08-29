//Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is 
// the smallest in lexicographical order
// among all possible results.

// Example 1:

// Input: s = "bcabc"
// Output: "abc"
// Example 2:

// Input: s = "cbacdcbc"
// Output: "acdb"


package Stack;

import java.util.*;
class Solution {
    public String removeDuplicateLetters(String s) {
        int lastIndex[] = new int[26];
        for(int i = 0; i<s.length();i++)
            lastIndex[s.charAt(i) - 'a'] = i;

            boolean seen[] = new boolean[26];
            Stack<Integer> stack = new Stack();
            for(int i=0; i<s.length();i++){
                int c = s.charAt(i) -'a';
                if(seen[c]) continue;
                while(!stack.isEmpty() && stack.peek() > c && i < lastIndex[stack.peek()])
                seen[stack.pop()] = false;

                stack.push(c);
                seen[c] = true;
            }

            StringBuilder sb = new StringBuilder();
            while(!stack.isEmpty())
            sb.append((char)(stack.pop() + 'a'));
            return sb.reverse().toString();
        }
        public static void main(String[] args) {
            Solution solution = new Solution();
            String s ="bcacabd";

            String result = solution.removeDuplicateLetters(s);
            System.out.println("Output is : "+ result);
        }
    }


