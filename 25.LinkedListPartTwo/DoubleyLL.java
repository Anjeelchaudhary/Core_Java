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
    public static int size = 1;

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
        size++;
        // System.out.println("Total Node in doubley LinedkedList is = "+size);
    }

    //removing first
    public int firstRemove() {
        //base case
        if(head == null) {
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }

        //if there is only one node
        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        //work done
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //adding at last
    public void lastAdd(int data) {
        Node newNode = new Node(data);

        //base case
        if(head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        //work done
        size++;
        tail.next = newNode;
        newNode.prev = tail;
        newNode = tail;
    }

    //removing at last
    public int removeLast() {
        //base case
        if(head == null) {
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }

        //if there is single node
        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        //workdone
        int val = tail.data;
        tail.prev = tail;
        tail.next = null;
        size--;
        return val;
    }

    //for printing
    public static void printu() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("null"+"  { Size = "+size+" }");
    }
     
    public static void main(String[] args) {
        DoubleyLL ll = new DoubleyLL();
        ll.firstAdd(3);
        ll.printu();
        ll.firstAdd(2);
        ll.printu();
        ll.firstAdd(1);
        ll.printu();
        ll.firstAdd(0);
        ll.printu();
        ll.firstRemove();
        ll.printu();
        ll.firstAdd(-1);
        ll.printu();
        ll.lastAdd(4);
        ll.printu();
        ll.removeLast();
        ll.printu();
    }
}
