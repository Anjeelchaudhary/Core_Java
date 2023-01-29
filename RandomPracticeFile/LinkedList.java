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
    }
}
