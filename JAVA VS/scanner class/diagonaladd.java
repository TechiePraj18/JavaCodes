public class diagonaladd {
    public static void main(String args[]) {
        int a[][] = { { 12, 34, 45, 19 }, { 10, 15, 67, 56 }, { 12, 34, 67, 24 }, { 45, 78, 69, 70 } };
        int sum = 0;

        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                if (r == c)
                    sum = sum + a[r][c];

            }
        }
        System.out.print(sum);
    }

}
