//Leetcode
// 1 step = Reverse whole array 0 to n-1 where n is size of array
// 2 step = Reverse first part 0 to k-1
// 3 step = Reverse second part from k to n-1


package Array;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int nums[]= {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(rotate(nums,k)));
    }

    // rotate Function
    public static int[] rotate(int[] nums, int k) {

        k = k%nums.length; //This is when there will be less size of array and k is greater. So it will not throw error else it will throw arrayindexoutofbound

        int n = nums.length; // n =7

        reverse(nums, 0, n-1); //1st step
        reverse(nums,0,k-1); // 2 step
        reverse(nums,k,n-1); // 3 step
        return nums;
        
    }
//function to reverse. It will call above reverse method one by one to swap
    public static void reverse(int[]nums,int i, int j){

        while(i<=j){
            int  temp =nums[i];
            nums[i] =nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

   

    
}
