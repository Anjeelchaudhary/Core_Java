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

    //for printing
    public static void printu() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoubleyLL ll = new DoubleyLL();
        ll.firstAdd(2);
        ll.printu();
        ll.firstAdd(1);
        ll.printu();
        ll.firstAdd(0);
        ll.printu();
    }
}
