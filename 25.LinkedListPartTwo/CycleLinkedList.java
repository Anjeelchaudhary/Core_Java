public class CycleLinkedList {
    //simple creatin a node
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

    public static boolean isCycle(int data) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        CycleLinkedList ll = new CycleLinkedList();
        head = ll.new Node(1);
        head.next = ll.new Node(2);
        head.next.next = ll.new Node(3);
        head.next.next.next = head;
        System.out.println(isCycle(0));
    }
}
