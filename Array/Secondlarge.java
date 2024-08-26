package Array;
import java.util.*;
public class Secondlarge {

    public static void secondlargest(int arr[]){

        int size = arr.length;

        // if size is less than two so we cannot get second largest as there will be only one element
        if(size<2){
            System.out.println("Invalid input");
            return;

        }

        Arrays.sort(arr);
        // System.out.println("Second largest : "+arr[size-2]);

        // if array has two same element then this method
        // 1,23,30,54,65,65

        for(int i = size-2; i>=0 ;i--){

            // it compares secondlast element with last element, is it is equal then it will move forward
            if(arr[i] != arr[size-1]){

                System.out.println("Second largest element is:"+arr[i]);
                return;
            }
            
        }
        System.out.println("There is no second largest element");
        

    }

    public static void main(String[] args) {

        int arr[] = new int[]{1,54,23,65,30,65};
        secondlargest(arr);
        
    }
    
}
