public class Recursion2 {
    public static void printNumb1(int n) {
        // Base CASE
        if (n == 10) {
            return;
        }
        // Outer Function which assume inner function will do further task
        System.out.println(n);
        // recursive function/inner function(this function call itself until it doesn't
        // met any base condition)
        printNumb1(n + 1);

    }

    // main function

    public static void main(String args[]) {
        int n = 1;
        printNumb1(n);
    }

}
