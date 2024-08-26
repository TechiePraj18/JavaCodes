// Leetcode solution

// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

// Example 1:

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
// Example 2:

// Input: nums1 = [1], m = 1, nums2 = [], n = 0
// Output: [1]
// Explanation: The arrays we are merging are [1] and [].
// The result of the merge is [1].
// Example 3:

// Input: nums1 = [0], m = 0, nums2 = [1], n = 1
// Output: [1]
// Explanation: The arrays we are merging are [] and [1].
// The result of the merge is [1].
// Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

// USE Two Pointer method

package Array;

public class MergeArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1=m-1, p2=n-1, i=m+n-1;

        while(p2>=0){
            if(p1>=0 && nums1[p1]> nums2[p2]){

                nums1[i--] = nums1[p1--];

            }else{
                nums1[i--] = nums2[p2--];       //i-- or p2-- is it will decrement after placing vale at that position

            }
        }
    }

    public static void main(String[] args) {
        
        int nums1[] = new int[6]; //Make this array of size 6 because we want to store more 3 elements of second array
        nums1[0] =2;
        nums1[1] =4;
        nums1[2] =9;
        int nums2[] = new int[]{6,10,3};

        MergeArray Merge = new MergeArray();
        Merge.merge(nums1, 3, nums2, 3);

        for(int num : nums1){

            System.out.print(num +" ");
        }
    }
}


