// //USING STACK
// Given the head of a singly linked list, reverse the list, and return the reversed list.
// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]

package LinkedList;

import java.util.Stack;

public class ReverseList {
    class ListNode {
        int val;
        ListNode next;
  
        ListNode(int val) { 
  
          this.val = val; 
      }
  
        ListNode(int val, ListNode next) { 
          
          this.val = val; 
          this.next = next; 
      
      }
    }
     public ListNode reverseList(ListNode head) {

        Stack<Integer> stack = new Stack<>();

        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode reverseList = new ListNode(stack.pop());
        ListNode ptr = reverseList;

        while(stack.isEmpty()){
            ptr.next = new ListNode(stack.pop());
            ptr = ptr.next;
        }
        return reverseList.next;
        
    }

    public static void main(String[] args) {
        ReverseList rl = new ReverseList();
        ReverseList.ListNode head = rl.new ListNode(1);
        head.next = rl.new ListNode(2);
        head.next.next = rl.new ListNode(3);
        head.next.next.next = rl.new ListNode(4);
        head.next.next.next.next = rl.new ListNode(5);

        // Print the original list
        System.out.println("Original list:");
        rl.printList(head);

        // Reverse the list
        ReverseList.ListNode reversedHead = rl.reverseList(head);

        // Print the reversed list
        System.out.println("Reversed list:");
        rl.printList(reversedHead);
    }

    // Helper method to print the linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
    

