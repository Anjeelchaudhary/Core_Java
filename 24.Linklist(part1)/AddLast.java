import java.util.LinkedList;

public class AddLast {
    public static class Node {
        int data;
        Node next;
        void Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static  Node head;
    public static  Node tail;

    public static void addinLogic(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.addingLogic(2);
        ll.addingLogic(3);
    }   
}
