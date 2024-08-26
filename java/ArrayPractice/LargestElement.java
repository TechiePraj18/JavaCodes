package ArrayPractice;

import java.util.*;
import java.util.Scanner;

public class LargestElement {
    public static void LargestElement(int[] array) {
        int max = 0; // user defined method
        for (int i = 1; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println("Largest Element: " + max);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] Arr = new int[size];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            Arr[i] = sc.nextInt();
        }

        LargestElement(Arr); // method calling
    }

}