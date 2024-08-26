import java.util.*;

public class NaturalNumber {
    public static void main(String[] args) {
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(num + " ");
            sum = sum + i;
        }
        System.out.println("Sum of first 20 natural no is: " + sum);
    }

}
