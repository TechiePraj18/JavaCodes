// You are given the head of a linked list.
// Remove every node which has a node with a greater value anywhere to the right side of it.
// Return the head of the modified linked list.

// Example 1:
// Input: head = [5,2,13,3,8]
// Output: [13,8]
// Explanation: The nodes that should be removed are 5, 2 and 3.
// - Node 13 is to the right of node 5.
// - Node 13 is to the right of node 2.
// - Node 8 is to the right of node 3.

package LinkedList;
public class removeNodes {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        
       class Solution {
           //First reverse List
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
       
           public ListNode removeNodes(ListNode head) {
               if(head == null) // BaseCase
                   return head;
       
               ListNode newHead = reverseList(head);//NewHead point head
                
               //remove newHead value in max variable 
               int max = newHead.val; 
               //three pointers
               ListNode p = newHead, q = newHead.next, r;
       
               while(q != null){
                   r = q.next;
       
                   //check q value with max, 
                   //if less then then remove that node and point p next to r,and update q.      
               if(q.val < max){ //remove q
               p.next = r;
               q = r;
               }else{ //update max value by q value shift all pointers
                   max = q.val;
                   p = q;
                   q = r;
       
               }
             }
           // again reverse the final node
             newHead = reverseList(newHead);
             return newHead;
               
           }
       }
       public class main{
        public static void main(String[] args) {
            
        }
       }
    
}
}
