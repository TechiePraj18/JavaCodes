import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;

public class prog1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no= ");
        int no = sc.nextInt();

        if (no % 2 != 0 || no >= 6 && no <= 20) {
            System.out.print("Weird");
        } else if (no >= 2 && no <= 5 || no > 20) {
            System.out.println("Not Weird");
        }
        System.out.print("ans");
    }
}
