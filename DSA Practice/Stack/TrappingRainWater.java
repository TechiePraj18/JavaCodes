package Stack;
import java.util.*;

class Solution {
    //height represent orginal building height 
    public int trap(int[] height){

        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int water =0;

        left[0] = height[0];      //Store height of 0th index

        for(int i = 1;i<n;i++){
        //Compare left buildings height at each step, Whichever buildings height is Greater from left building store in left array
            left[i] = Math.max(left[i-1],height[i]);
        } 

        right[n-1] = height[n-1]; //Store height of last index

        for(int i=n-2;i>=0;i--){
        //Compare right buildings height at each step from back, Whichever buildings           height is Greater store in right array
            right[i] = Math.max(right[i+1],height[i]);
        }
        
        for(int i=0;i<n;i++){
            //Compare height and whichever height is minimum then subtract 
            water += (Math.min(left[i],right[i]) - height[i]);
        }
        return water;
    }

        public static void main(String[] args) {
            Solution solution = new Solution();

            int height[] = {0,2,4,1,3,4};

            int result = solution.trap(height);
            System.out.println("WaterTrapped is: "+ result);

        }
    }
