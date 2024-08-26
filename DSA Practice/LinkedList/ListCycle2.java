// Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

// There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

// Example 1:
// Input: head = [3,2,0,-4], pos = 1
// Output: tail connects to node index 1
// Explanation: There is a cycle in the linked list, where tail connects to the second node.

// Hare and tortoise or Floyd's algorithm
package LinkedList;
import java.util.*;

public class ListCycle2 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
   
    public class Solution {

        public ListNode detectCycle(ListNode head) {
    
            //Start both from head
            ListNode slow = head , fast =head;
    
            //Advancde both speeds until they meet once
            while(fast != null && fast.next != null){
                  fast = fast.next.next;
                slow = slow.next;
              
             // As soon as they meet, 
             //Start from head again and move both head and slow pointers at same speed
                if(slow == head){
                    while(head != slow){
                    head = head.next;
                    slow = slow.next;
                    }
                    return slow;
                }       
            }
            return null;
            
        }
        
    }
    public static void main(String[] args) {
        ListCycle2 listCycle2 = new ListCycle2();
        Solution solution = listCycle2.new Solution();
        
        // Create nodes
        ListNode head = listCycle2.new ListNode(3);
        ListNode node2 = listCycle2.new ListNode(2);
        ListNode node3 = listCycle2.new ListNode(0);
        ListNode node4 = listCycle2.new ListNode(-4);

        // Link nodes
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creates a cycle with node2 as the start

        // Detect cycle
        ListNode cycleStart = solution.detectCycle(head);

        if (cycleStart != null) {
            System.out.println("Cycle detected starting at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
    
    
}
