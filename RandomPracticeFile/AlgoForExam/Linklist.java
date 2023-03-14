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
            System.out.println("It was empty");
            head = tail = newNode;
            return;
        }

        //if there is already there a node
        newNode.next = head;
        head = newNode;
    }

    public void addNodeLast(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            System.out.println("It was empty");
            head = tail = newNode;
            return;
        }

        //if there was node Already there
        tail.next = newNode;
        tail = newNode;
    }

    //for printingFunction
    public void printMe() {
        //base case
        if(head == null) {
            System.out.println("Empty Node");
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        Linklist ll = new Linklist();
        ll.addNodeFirst(3);
        ll.addNodeFirst(2);
        ll.addNodeFirst(1);
        ll.addNodeLast(4);
        ll.addNodeLast(5);
        ll.printMe();
    }
}
