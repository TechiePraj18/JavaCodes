import java.util.*;
public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();

        int digit;

        int sum =0;

        while(n>0){
            digit = n%10;
            sum = sum+digit;
            n=n/10;
        }
        System.out.println("Sum of digit : "+sum);

    }
    
}
