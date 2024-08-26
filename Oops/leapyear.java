import java.util.*;
public class leapyear {

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a year: ");
    int Year = sc.nextInt();

    if(Year%400==0){
        System.out.println(Year+"is leap year");
    }

    else if (Year % 4==0 && Year % 100!=0) {

        System.out.println(Year+"is leap year");
        
    }
    else{
        System.out.println(Year+"is not leap year");
    }
     

    
}

    
}

