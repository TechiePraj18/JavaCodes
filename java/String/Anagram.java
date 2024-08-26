package String;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "Brag";
        String s2 = "Grab";

        // Covert both string to lower case
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Checking for length of string

        if (s1.length() != s2.length()) {
            System.out.println("Strings are not anagram");

        } else {

            // convert string to character array
            char[] Str1 = s1.toCharArray();
            char[] Str2 = s2.toCharArray();

            // Sort both arrays

            Arrays.sort(Str1);
            Arrays.sort(Str2);

            // compare both the arrays using inbuilt function equals

            if (Arrays.equals(Str1, Str2)) {
                System.out.println("String " + s1 + " and " + s2 + " are anagram");
            } else
                System.out.println("not anagram");

        }
    }

}
