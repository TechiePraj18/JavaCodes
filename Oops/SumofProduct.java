import java.util.Scanner;

public class SumofProduct{
    public static void main(String[] args) {

        int sum = 0;
        int temp =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = sc.nextInt();

    
        while( n<=100){
            sum = sum+n;
            n = n+10;
          

        }
        System.out.println("Sum of product: "+sum);
    }
}