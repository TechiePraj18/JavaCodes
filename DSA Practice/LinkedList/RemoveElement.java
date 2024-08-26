// Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head
// Input: head = [1,2,6,3,4,5,6], val = 6
// Output: [1,2,3,4,5]

package LinkedList;
import java.util.*;
public class RemoveElement {

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

    //Function to remove elements
    public static ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = dummy;

        while(curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
            }
            else{
            curr = curr.next;
            }
                     
        }
         return dummy.next;
      
    }
    


class main{
        public static void main(String[] args) {
            // Creating a linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(6);
            head.next.next.next = new ListNode(3);
            head.next.next.next.next = new ListNode(4);
            head.next.next.next.next.next = new ListNode(5);
            head.next.next.next.next.next.next = new ListNode(6);
    
            // Print the original list
            System.out.println("Original list:");
            printList(head);
    
            // Removing all elements with value 6
            ListNode updatedHead = removeElements(head, 6);
    
            // Print the updated list
            System.out.println("Updated list:");
            printList(updatedHead);
        }

        //Function to printList
        public static void printList(ListNode head) {
            ListNode curr = head;//Head will point currentnode

            while (curr != null) {
                System.out.print(curr.val + " -> "); //current node value will print
                curr = curr.next;
            }
            System.out.println("null");
        }
    
    } 
   
}

