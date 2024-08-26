public class twodarray {
    public static void main(String args[]) {
        int a[][] = { { 2, 34, 21, 12 }, { 10, 79, 67, 5 }, { 20, 49, 50, 48 }, { 28, 56, 45, 90 } };

        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                System.out.print(a[r][c] + " ");
            }
            System.out.print("\n");
        }
    }

}
