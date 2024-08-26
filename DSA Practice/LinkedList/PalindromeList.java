// Given the head of a singly linked list, return true if it is a 
// palindrome
//  or false otherwise
//  Input: head = [1,2,2,1]
// Output: true

package LinkedList;
import java.util.*;

public class PalindromeList {
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

    public boolean isPalindrome(ListNode head) {

        ListNode fast = head, slow = head;
        // Will find first middle of list using hare and tortoise or floyd cycle algo
        while(fast!=null && fast.next != null){
            slow = slow.next;           //this will go one step 
            fast = fast.next.next;       //this will go two step ahead
            
        }
        if(fast!=null){  // odd nodes : let right half smaller
            slow = slow.next;
        }

        //Reverse the second half
        slow  = reverseList(slow);  //Here slow is passed as head to list
        fast = head;   // Fast will point now head

        // Start comparing one by one

        while(slow != null){
            if(fast.val != slow.val)
            return false;

            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
// Function to reverse list
     public ListNode reverseList(ListNode head){
   ListNode prev = null;
   ListNode curr = head;

   while( curr != null){
    ListNode next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;

   }
   return prev;

    }

    //Main Function
    public static void main(String[] args) {
        // Object created
        PalindromeList palindromeList = new PalindromeList();
        
        // Creating the linked list: 1 -> 2 -> 2 -> 1
        ListNode head = palindromeList.new ListNode(1);
        head.next = palindromeList.new ListNode(2);
        head.next.next = palindromeList.new ListNode(2);
        head.next.next.next = palindromeList.new ListNode(1);

        // Checking if the linked list is a palindrome by making function call and stored in variable result
        boolean result = palindromeList.isPalindrome(head);

        // Printing the result
        if(result) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
    

