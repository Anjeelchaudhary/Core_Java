import java.util.LinkedList;

public class AddFist {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void adding(int data) {
        //strp1:-creating a node
        Node newNode = new Node(data);
    
        if(head == null) {
            head = tail = newNode;
            return;
        }
        //step2:-newNode pointing towards head
        newNode.next = head;
        //newNode becomes the head node
        newNode = head;
    }

    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        ll.adding(1);
        ll.adding(2);
    }
}