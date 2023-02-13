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

    public static void removeCycle() {
        //1st case detecting cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                cycle = true;
                break;
            }
        }

        if(cycle == false) {
            return;
        }

        //finding meeting point
        slow = head;
        Node previous = null;
        while(slow != fast) {
            previous = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //removing cycle
        previous.next = null;

    }    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        head = ll.new Node(1);
        Node temp = ll.new Node(3);
        head.next = temp;
        head.next.next = ll.new Node(3);
        head.next.next.next = temp;
        removeCycle();
        System.out.println();
    }
}
