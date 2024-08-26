// Given head, the head of a linked list, determine if the linked list has a cycle in it.

// There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

// Return true if there is a cycle in the linked list. Otherwise, return false.
// Input: head = [3,2,0,-4], pos = 1
// Output: true
// Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

package LinkedList;
import java.util.*;

public class ListCycle {

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
 //Hare and tortoise 
public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode fastptr = head;
        ListNode slowptr = head;

        while(slowptr != null && fastptr != null && fastptr.next != null){

            //Advance Both pointers
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;

            //If they meet we found loop
            if(slowptr == fastptr)
            return true;
        }
        return false;
    }
}
public static void main(String[] args) {
    ListCycle listCycle = new ListCycle();

    // Solution Class: Contains the hasCycle method that detects whether a linked list has a cycle using the hare and tortoise approach.
    Solution solution = listCycle.new Solution();
    
    // Creating a list with a cycle
    ListNode head = listCycle.new ListNode(1);
    head.next = listCycle.new ListNode(2);
    head.next.next = listCycle.new ListNode(3);
    head.next.next.next = listCycle.new ListNode(4);
    head.next.next.next.next = listCycle.new ListNode(5);
    head.next.next.next.next.next = head.next.next; // Creating a cycle

    // Test if the list has a cycle
    boolean result = solution.hasCycle(head);
    System.out.println( result +", the List has cycle"); // Expected: true
    
}
}
