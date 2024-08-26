public class RecursionFactorial {
    // function
    public static int calcfactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        // outer function
        int fact_nm1 = calcfactorial(n - 1);
        // Recursive function
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    // main function
    public static void main(String args[]) {
        int n = 8;
        // function call
        int ans = calcfactorial(n);
        System.out.println(ans);
    }

}
