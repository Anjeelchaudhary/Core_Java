public class Zigzag {
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

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node leftHead = head;
        Node rightHead = prev;
        Node nextL , nextR;

        
        //alterMerg - zigzag
        while(leftHead != null && rightHead != null) {
            nextL = leftHead.next;
            leftHead.next = rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;

            leftHead = nextL;
            rightHead = nextR;
        }
    }
    public static void main(String[] args) {
        Zigzag ll = new Zigzag();
        ll.addLast(1);//here add last function should be added mannually 
        ll.addLast(2);//here add last function should be added mannually 
        ll.addLast(3);//here add last function should be added mannually 
        ll.addLast(4);//here add last function should be added mannually 
        ll.addLast(5);//here add last function should be added mannually 
        //1->2->3->4->5
        ll.print();
    }
}
