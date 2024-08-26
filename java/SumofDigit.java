import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        int sum = 0, Digit;
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the no = ");
        int n = abc.nextInt();

        while (n > 0) {
            Digit = n % 10;
            sum = sum + Digit;
            n = n / 10;
        }
        System.out.println("Sum of digit = " + sum);

    }
}
