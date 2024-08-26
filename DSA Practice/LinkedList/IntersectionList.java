
package LinkedList;

import java.util.*;

public class IntersectionList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        // Helper method to calculate the size of the list
        public static int size(ListNode head) {
            int size = 0;
            while (head != null) {
                size++;
                head = head.next;
            }
            return size;
        }

        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            int lenA = size(headA); // return size
            int lenB = size(headB); // return size

            // Check the length of both list, Greater one will travel till equal length

            while (lenA > lenB) {
                lenA--;
                headA = headA.next;

            }
            while (lenB > lenA) {
                lenB--;
                headB = headB.next;
            }

            // Now Both heads are at same distance from intersection
            // Start moving them simultaneously until they doesnot meet each other
            while (headA != headB) {
                headA = headA.next;
                headB = headB.next;

            }
            return headA;

        }
    }

    public static void main(String[] args) {
        // A) Outer Class (IntersectionList):

        // 1) IntersectionList is the outer class that contains both the ListNode inner
        // class (representing the nodes in the linked list) and the Solution inner
        // class (which contains the method to find the intersection node).
        // 2)The line IntersectionList outer = new IntersectionList(); creates an
        // instance of the IntersectionList class.
        // 3)This instance (outer) is necessary because the Solution class is an inner
        // class of IntersectionList. To create an instance of an inner class, you need
        // an instance of the outer class.

        // B) Inner Class (Solution):

        // a) The inner class (Solution) can access the members (fields, methods) of its
        // enclosing outer class (IntersectionList). If you needed to reference
        // something from the outer class within the inner class, this connection would
        // make it possible.
        // 1) Solution is defined as an inner class within IntersectionList. In Java,
        // non-static inner classes (like Solution) have an implicit reference to their
        // enclosing (outer) class.
        // 2) To create an instance of Solution, you first need an instance of the
        // enclosing IntersectionList class.
        // 3) The line Solution solution = outer.new Solution(); does the following:
        // 4) It uses the outer instance of IntersectionList to create an instance of
        // the inner Solution class.
        // // The syntax outer.new Solution() specifies that Solution is being
        // instantiated in the context of the outer object.
        IntersectionList outer = new IntersectionList();
        Solution solution = outer.new Solution();

        // Create listNodes given name

        ListNode headA = outer.new ListNode(1);
        ListNode nodeA1 = outer.new ListNode(2);

        ListNode headB = outer.new ListNode(3);
        ListNode nodeB1 = outer.new ListNode(4);
        ListNode nodeB2 = outer.new ListNode(5);

        // Create common intersection nodes
        ListNode commonNode1 = outer.new ListNode(8);
        ListNode commonNode2 = outer.new ListNode(10);

        // Link the nodes for list A
        headA.next = nodeA1;
        nodeA1.next = commonNode1;

        // Link the nodes for list B
        headB.next = nodeB1;
        nodeB1.next = nodeB2;
        nodeB2.next = commonNode1;

        // Link the common intersection nodes
        commonNode1.next = commonNode2;

        // Find the intersection node, Function call
        ListNode intersection = solution.getIntersectionNode(headA, headB);

        // Print the intersection node value if it exists
        if (intersection != null) {
            System.out.println("The intersection node value is: " + intersection.val);
        } else {
            System.out.println("There is no intersection.");
        }
    }

}
