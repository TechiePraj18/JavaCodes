import java.util.*;

public class StackclassLL {

    // linked list node creation
    private static class Node {

        int data;
        Node next;

        public Node(int data) {

            // this refers to current object in constructor
            this.data = data;
            this.next = null;
        }
    }

    // check whether stack or node is empty or not, if it isEmpty then head == null
    // is true
    static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;

        }

        // Stack push operation function

        public void push(int data) {

            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        // Pop operation function

        public int pop() {
            if (isEmpty()) {
                // -1 bcoz stack is empty
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }

        // peek operation function
        public int peek() {
            if (isEmpty()) {
                return -1;

            }
            return head.data;
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
