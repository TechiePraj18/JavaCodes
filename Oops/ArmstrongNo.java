import java.util.*;
import java.lang.Math;


public class ArmstrongNo {

    public static void main(String[] args) {

        int remainder, sum =0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        String s1 = Integer.toString(n);
        int len = s1.length();              //To remove length it is converted to string

        temp=n;

        while(n>0){
            remainder =n%10;
            sum = (int) (sum+ Math.pow(remainder,len));
            n = n/10;
        }
        if(sum==temp){
            System.out.println(sum+" is armstrong");
        }
        else
        System.out.println(sum+" is not armstrong");
    }
    
}
