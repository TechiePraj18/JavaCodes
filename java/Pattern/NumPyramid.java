package Pattern;

public class NumPyramid {

    public static void printPattern(int n) {

        int i, j;

        // outer loop for rows

        for (i = 1; i <= n; i++) {

            // inner loop to print numbers
            for (j = 1; j <= i; j++) {

                System.out.print(j + " ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        int n = 6;
        printPattern(n);
    }

}
