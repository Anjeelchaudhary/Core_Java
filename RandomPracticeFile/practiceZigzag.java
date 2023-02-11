public class practiceZigzag {
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

    public void zigZagZone() {
        //find mid
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half(3-variable and 4-steps)
        Node current = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        Node rightHead = current;
        Node leftHead = head;
        Node nextR,nextL;
        
        //alterMerg - zigzag
        while(rightHead != null && leftHead != null) {
            nextL = leftHead.next;
            leftHead.next = rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;

            rightHead = rightHead.next;
            leftHead = leftHead.next;
        }
    }
    public static void main(String[] args) {
        
    }
}
