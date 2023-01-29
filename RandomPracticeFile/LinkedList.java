public class LinkedList {
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

    //adding first Node
    public void firstAddition(int data) {
        Node newNode = new Node(data);
        
        //if there is only one Node
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //if there is more than one Node in list
        newNode.next = head;
        head = newNode;

    }

    //adding at last
    public void lastAddition(int data) {
        Node newNode = new Node(data);

        //base case
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //actual work
        tail.next = newNode;
        newNode = tail;
    }
    //adding at Middle should be declare as Node Not eighther int or void
    public Node middleAddition(int data) {
        Node newNode = new Node(data);
        Node slow = head;
        Node fast = head;
        //intial state
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //actual work
        newNode.next = slow.next;
        slow.next = newNode;
        return newNode;
    }

    //printing all nodes
    public static void print() {
        if(head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.firstAddition(2);
        ll.print();
        ll.firstAddition(1);
        ll.print();
        ll.lastAddition(3);
        ll.print();
        ll.middleAddition(9);
        ll.print();
    }
}
