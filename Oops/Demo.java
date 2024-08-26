import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int result;

        if (N % 2 != 0) { // Odd position
            int index = N + 1 / 2 - 1; // N+1 because it will take coorect value else it will be a floating value if we
                                       // just divide by 2
            result = (int) Math.pow(2, index);
        } else { // Even position
            int index = N / 2 - 1;
            result = (int) Math.pow(3, index);
        }

        System.out.println(result);
    }
}
