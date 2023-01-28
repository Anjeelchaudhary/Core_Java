import java.util.LinkedList;

public class PracticeFirstNode {
    public class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void firstAddition(int data) {
        Node newNode = new Node(data);
        
        //if there is only one Node
        if(head == null) {
            newNode = head =tail;
            return;
        }

        //if there is more than one Node in list
        newNode.next = head;
        head = newNode;

    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.firstAddition(1);
        ll.firstAddition(2);
    }
}
