import java.util.*;
public class totaldigit {
    public static void main(String[] args) {
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();

        while(n>0){
            n = n/10;
            cnt++;
        }
        System.out.println("Total Digit = "+cnt);
    }
    
}
