import java.util.LinkedList;

public class LastRemove {
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
    public static int  size;//this will give us the size of the linked list
    
    public int removeLast() {
        //special case for removing last node
        if(size == 0) {
            System.out.println("ll is emplty");
            return Integer.MIN_VALUE;
        }else if(size == 1) {
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        Node previous = head;
        for(int i=0;i<size-2;i++) {
            previous = previous.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.removeLast();
    }
}
