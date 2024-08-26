import java.util.*;
public class PalindromeNo {

    public static void main(String[] args) {

        int remainder;
        int sum = 0;
        int temp;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        temp = n;

        while(n>0){

            remainder = n%10;
            sum = sum*10 + remainder;
            n = n/10;
        }
        if(sum==temp){
            System.out.println(sum +" is palindrome number ");
        }
        else
         System.out.println(sum +" is not palindrome number");

    }
    
}
