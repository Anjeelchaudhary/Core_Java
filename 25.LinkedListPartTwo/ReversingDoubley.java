public class ReversingDoubley {
    public class Node {
        int data;
        Node prev;
        Node next;
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void revDo() {
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = null;
            curr.prev = next;
            curr.prev = 
            prev = curr;
            curr = next;
        }
    }
    public static void main(String[] args) {
        ReversingDoubley ll = new ReversingDoubley();
        
    }
}
