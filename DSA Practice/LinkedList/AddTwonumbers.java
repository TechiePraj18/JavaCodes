// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

//L1 =  2 --> 4 --> 3
//L2 =  5 --> 6 --> 4
//342 + 465 = 807
// final output = 7 --> 0 --> 8 
package LinkedList;
import java.lang.classfile.components.ClassPrinter.ListNode;

public class AddTwonumbers {

//   Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode ptr = result;              
        int carry = 0;               //Set default carry

        while(l1 != null || l2 != null){

           int sum = 0+carry;  //Initialize Sum

            if(l1 != null){
                sum += l1.val;    //use number from l1 list
                l1 = l1.next;

            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum/10;   //It will be used when value is of two, three digit.It wil carry digit
            sum = sum%10;
            ptr.next = new ListNode(sum);  //it will store value in new node bcoz first value will be 0
            ptr = ptr.next;

        }

        if(carry == 1)       //if carry is remaining then this
         ptr.next = new ListNode(1);

         return result.next;     // as result pointing at zero

        }
    }

    
}



