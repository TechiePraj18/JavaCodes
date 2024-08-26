package Pattern;

import java.util.*;

public class NumTriangle {

    public static void printPattern(int n) {

        // outer loop to handle no of rows
        for (int i = 1; i <= n; i++) {

            // inner loop to print spaces
            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");
            }

            // inner loop to print numbers
            for (int j = 1; j <= i; j++) {

                System.out.print(i + " ");
            }
            // to print new line for each row

            System.out.println();

        }

    }

    public static void main(String args[]) {
        int n = 6;
        printPattern(n);
    }

}
