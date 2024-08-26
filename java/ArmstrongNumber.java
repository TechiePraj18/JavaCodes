
import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int temp;
        int sum = 0;
        int remainder;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();

        String s1 = n + " ";
        int len = s1.length();

        temp = n;

        while (n > 0) {
            remainder = n % 10;
            sum = (int) (sum + Math.pow(remainder, len));
            n = n / 10;
            System.out.println(sum);

        }
        if (sum == temp)
            System.out.println(n + "is armstrong number");
        else
            System.out.println(n + "is not armstrong no");

    }

}
