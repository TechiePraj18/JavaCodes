package String;

import java.util.*;

public class DivideString {
    public static void main(String[] args) {

        String s1 = "aaabbbccc";

        // determines variable to divide string in 'n' equal parts
        int n = 3;

        // Stores the length of the string
        int len = s1.length();
        int temp = 0;
        int chars = len / n;

        // Store the array of string
        String[] str1 = new String[n];

        // Check whether a string can be divided into n equal parts

        if (len % n != 0) {
            System.out.println("String " + s1 + " cannot be divided");
        } else {
            for (int i = 0; i < len; i = i + chars) {

                // Dividing string in n equal part using substring()
                String Subpart = s1.substring(i, i + chars);

                // it will store subpart at 0th index of str1 array
                str1[temp] = Subpart;
                temp++;
            }
        }
        System.out.println(n + " Equal parts are : ");
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }

    }

}
