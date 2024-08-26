// You are given the head of a linked list, and an integer k.
// Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

// Example 1:

// Input: head = [1,2,3,4,5], k = 2
// Output: [1,4,3,2,5]

// Example 2:

// Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
// Output: [7,9,6,6,8,7,3,0,9,5]

package LinkedList;

public class SwapNodes {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {

        //Method
        public ListNode swapNodes(ListNode head, int k) {
            // use two pointers and extra pointer (First)
            ListNode fast = head;
            ListNode slow = head;

            // loop will reun until k values doesn't become 0. If k =2(predecrement)
            for (int i = 1; i < k; i++) {
                fast = fast.next;
            }
            ListNode first = fast; // Remove value in another node

            while (fast.next != null) { // Go on until it reaches null and then swap first with slow
                slow = slow.next;
                fast = fast.next;
            }
            // Swap
            int temp = first.val;
            first.val = slow.val;
            slow.val = temp;
            return head;
        }

    }

}
