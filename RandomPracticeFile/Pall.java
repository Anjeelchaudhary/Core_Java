public class Pall {
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

    public Node middleFind(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // here slow is the midNode in linkedList
    }

    public boolean calcPalindrome() {
        //if there is single node or empty node
        if(head == null && head.next == null) {
            return true;
        }

        Node midd = middleFind(head);

        Node prev = null;
        Node curr = midd;
        Node next ;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //left side head
        Node left = head;  //right side head

        while(right != null) {
            if(right.data != right.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
    public static void main(String[] args) {
        
        
    }
}
