package Array;

public class Splitarray {
    

        public static void main(String[] args) {
            // Original array
            int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
    
            // Find the middle index
            int middle = (originalArray.length + 1) / 2;
    
            // Create two new arrays
            int[] firstHalf = new int[middle];
            int[] secondHalf = new int[originalArray.length - middle];
    
            // Copy the first half of the original array into firstHalf(array name)
            System.arraycopy(originalArray, 0, firstHalf, 0, middle);
    
            // Copy the second half of the original array into secondHalf(array anme) it starts from (5,6,7)
            System.arraycopy(originalArray, middle, secondHalf, 0, originalArray.length - middle);
    
            // Print the two halves
            System.out.print("First half: ");
            // for-each loop(type variablename : arrayname)
            for (int i : firstHalf) {
                System.out.print(i + " ");
            }
    
            System.out.print("\nSecond half: ");
            for (int i : secondHalf) {
                System.out.print(i + " ");
            }
        }
    }
    
    

