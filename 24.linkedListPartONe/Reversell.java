public class Reversell {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int  size;

    public static void revLinkedlist() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }
    public static void main(String[] args) {
        Reversell ll = new Reversell();
        ll.revLinkedlist();
    }
}
