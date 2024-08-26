// Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.
// Input: head = [1,2,3,3,4,4,5]
// Output: [1,2,5]
package LinkedList;

public class RemoveDuplicates {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;

        while(head != null){

            //check if head is not null and head value is equal to heads next value. If it is equal skip and increment head
            if(head.next != null && head.val == head.next.val){
                //skip the nodes whose values are equal
                while(head.next != null && head.val == head.next.val){
             head = head.next;
                }
                prev.next = head.next; //Previous will point directly to head.next is it is not equal
                
            }else{
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
