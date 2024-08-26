import java.util.Scanner;
public class SquareofNo {
 

//  method
    public static int returnSquare(int num) {
        return num*num;
    }
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
 
        
        // method call and stored in new varaiable
        int square = returnSquare(num);
 
        // Displaying the Square
        System.out.println("The Square of the number is : " + square);
    }
}
    

