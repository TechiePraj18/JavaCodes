import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count: ");
        int a = sc.nextInt();
        System.out.println("0 " + "1");

        for (int i = 2; i < a; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }

}
