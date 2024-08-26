// Remove Nth node from end of the list
// Given the head of a linked list, remove the nth node from the end of the list and return its head
// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
// Example 2:

// Input: head = [1], n = 1
// Output: []
// Example 3:

// Input: head = [1,2], n = 1
// Output: [1]

package LinkedList;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class RemoveNode {
 
  public class ListNode {
      int val;
      ListNode next;

      ListNode(int val) { 

        this.val = val; 
    }

      ListNode(int val, ListNode next) { 
        
        this.val = val; this.next = next; 
    
    }
  }

    public ListNode removeNthFromEnd(ListNode head, int n) {

// Dummy node will be at -1 position. 
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode ptr1 = dummy;
        ListNode ptr2 = dummy;
// Move second pointer n spaces ahead.
        for(int i=0; i < n; i++){
            ptr2 = ptr2.next;
        }
// Move Both pointer until the next of second pointer is null.
        while(ptr2.next != null){

            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
// Remove node next to first pointer and make connection with next to next node.
        ptr1.next = ptr1.next.next;

        return dummy.next;
        
    }

    public static void main(String[] args) {

        // created sample linkedlist
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        RemoveNode solution = new RemoveNode();
        int n = 2;  // Remove the 2nd node from the end (which is '4' in this case)

        head = solution.removeNthFromEnd(head, n);

    // Helper function to print the linked list.
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

    }
}
    

