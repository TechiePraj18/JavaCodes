public class Recursion1 {
    // create function
    public static void printNumb(int n) {
        // Base CASE
        if (n == 0) {
            return;
        }
        // Outer Function which assume inner function will do further task
        System.out.println(n);
        // recursive function/inner function(this function call itself until it doesn't
        // met any base condition)
        printNumb(n - 1);

    }

    // main function

    public static void main(String args[]) {
        int n = 7;
        printNumb(n);
    }

}
