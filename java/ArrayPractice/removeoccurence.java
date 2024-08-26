package ArrayPractice;

// Java program remove all occurrences 
// of an element from Array using naive method 
import java.util.*;

public class removeoccurence {

    // function to remove all occurrences
    // of an element from an array
    public static int[] removeElements(int[] arr, int key) {
        // Move all other elements to beginning
        int index = 0;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] != key)
                arr[index++] = arr[i];

        return Arrays.copyOf(arr, index);

    }

    // Driver code
    public static void main(String[] args) {
        int[] array = { 3, 9, 2, 3, 1, 7, 3, 5 };
        int key = 3;
        array = removeElements(array, key);
        System.out.println(Arrays.toString(array)); // represnt string

    }
}
