import java.util.Scanner;

public class ReverseNo {

    public static void main(String[] args) {
        int reverse =0;
        int remainder;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();

        while(n>0){
            remainder = n%10;
            reverse = reverse*10 + remainder;
            n = n/10;
        }
        System.out.println("Reverse number : "+reverse);
    }
    
}

