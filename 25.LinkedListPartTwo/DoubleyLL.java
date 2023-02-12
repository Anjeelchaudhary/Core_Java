public class DoubleyLL {

    //Crationg of doubly linkedList
    public class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;

    //adding at first
    public void firstAdd(int data) {
        Node newNode = new Node(data);

        //base case
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //workdone
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public static void main(String[] args) {
        DoubleyLL ll = new DoubleyLL();
        ll.firstAdd(2);
        ll.firstAdd(1);
        ll.firstAdd(0);
    }
}
