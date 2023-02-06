class MergInList {
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


    //actual calling of function 
    public Node Merg(Node head) {
        //base case
        if(head == null || head.next == null) {
            return head;
        }

        //1st - To find node
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