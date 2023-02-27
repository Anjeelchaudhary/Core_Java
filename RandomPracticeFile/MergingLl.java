class MergingLl {
    //created a node class 
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

    // finding mid
    public static Node getMid(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //MergSort logic
    public Node mergSortFunction(Node head1,Node head2){
        Node dumMergll = new Node(-1);
        Node temp= dumMergll;
        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        //sorting for leftover 
        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        //sorting for leftover 
        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        //because 1st node is node having -1 so to make it garbage value
        return dumMergll.next;
    } 

    //actual calling of function 
    public Node Merg(Node head) {
        //base case
        if(head == null || head.next == null) {
            return head;
        }

        //1st - To find mid node
        Node mid = getMid(head);
        //left and right MergSort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLefttHead = Merg(head);
        Node newRightHead = Merg(rightHead);

        //Merg
        return mergSortFunction(newLefttHead,newRightHead);
    }
    public static void main(String[] args) {
        // MergInList ll = new MergInList();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);

        // ll.head = ll.Merg(ll.head);
        // ll.print();
    }
}