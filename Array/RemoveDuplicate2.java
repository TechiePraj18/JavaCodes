package Array;
// LeetCode
// Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

// Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

// Return k after placing the final result in the first k slots of nums.

// Example 1:

// Input: nums = [1,1,1,2,2,3]
// Output: 5, nums = [1,1,2,2,3,_]
// Explanation: Your function should return k = 5


public class RemoveDuplicate2 {

    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int n : nums){
            if(i<2 || n!=nums[i-2]){
                nums[i++] =n;
            }
        }
        return i;
        
    }
    
}
