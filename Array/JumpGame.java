// You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

// Return true if you can reach the last index, or false otherwise.

// Example 1:

// Input: nums = [2,3,1,1,4]
// Output: true
// Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
// Greedy approach
package Array;

public class JumpGame {
    public boolean canJump(int[] nums) {

        int final_position = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {

            // For each element in the array, it checks if you can jump from the current position i to at least the final_position.
            // i + nums[i] calculates the farthest position you can reach from the current index i.
            //i is the current index in the loop. nums[i] is the maximum jump length from the current index.
            // If you can reach or go beyond the final_position from the current index, it
            // updates the final_position to the current index i.
            if (i + nums[i] >= final_position) {
                final_position = i;
            }
        }
        return final_position == 0;

    }

}
