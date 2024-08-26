// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

// Return the head of the merged linked list.

// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]
// Example 2:

// Input: list1 = [], list2 = []
// Output: []
// Example 3:

// Input: list1 = [], list2 = [0]
// Output: [0]

package LinkedList;

public class MergeList {

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //Create dummy node to start
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode headNode = dummy;

        //traverse till one of the node reaches end
        while(list1 != null && list2 != null){

            //Compare the 2 values of lists
            if(list1.val <= list2.val){
                dummy.next = list1;
                list1 = list1.next;
            }else{
                dummy.next = list2;
                list2= list2.next;
            }
          
            dummy = dummy.next;

        }
        //Append remaining list
        if(list1==null){
            dummy.next = list2;
        }else if(list2==null){
            dummy.next = list1;
        }
     return headNode.next;
}
}
    
}
