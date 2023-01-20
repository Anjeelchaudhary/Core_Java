

import java.util.LinkedList;

public class PrintingList {
    //creating a node
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }
    public static Node head;
    public static Node tail;

    //function for adding a node at first
    public static void addFirst(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = null;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }

    //function for adding a node at last
    public static void addLast(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = null;
            return;
        }

        tail.next = newNode;
        newNode = tail;
    }

    //function for printing a linked list
    public void print() {
        if(head == null) {
            System.out.println("empty linkedList");
        }

        Node temp = head;
        while(head != null) {
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    
    }    
}
