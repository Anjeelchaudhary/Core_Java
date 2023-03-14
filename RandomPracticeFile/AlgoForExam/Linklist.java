package AlgoForExam;

public class Linklist {

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

    public void addNodeFirst(int data) {
        Node newNode = new Node(data);   //created a node

        //adding at first
        //base case
        if(head == null) {
            System.out.println("empty is empty ");
            head = tail = newNode;
            return;
        }

        //if there is already there a node
        newNode.next = head;
        head = newNode;
    }
    public static void main(String[] args) {
        
    }
}
