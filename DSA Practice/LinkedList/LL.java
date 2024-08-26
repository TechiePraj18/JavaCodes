package LinkedList;

import java.util.*;

class LL {

    Node head;

    class Node {

        String data; // store data
        Node next; // Pointing next node

    }

    Node(String data){ //constructor
        this.data = data;
        this.next= null;
        
        
    }

}

    // Add first

    public void addFirst(String data) {

        // Create a new node
        Node newnode = new Node(data);

        // Check if head is null or not

        if (head == null) {
            head = newnode;
            return;
        }

        // if list already exist
        newnode.next = head;
        head = newnode;

    }

    // Add Last

    public void addLast(
            String data) {

        // Create a new node
        Node newnode = new Node(data);

        // Check if head is null or not

        if (head == null) {
            head = newnode;
            return;
        }

        Node currnode = head;

        while (currnode.next != null) {
            currnode = currnode.next;
        }
        currnode.next = newnode;

    }

    // Print list
    public void PrintList() {
        Node currnode = head;

        while (currnode.next != null) {
            System.out.println((currnode.data + " --> "));
            currnode = currnode.next;
        }
        System.out.println("nULL");

    }

    // Delete first

    public void deletefirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head.next = head;
    }

    // delete last

public void DeleteLast(){

    if(head==null){
        System.out.println("List is empty");
        return;
    }
    if(head.next==null){
        head = null;
        return;
    }

    Node SecondLast = head;
    Node LastNode = head.next;

    while(LastNode.next!=null){
        
        LastNode.next = LastNode;
        SecondLast.next = SecondLast;

    }
    SecondLast.next=null;

}
