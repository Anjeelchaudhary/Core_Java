public class MergList {
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


    public static Node getMid(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public  Node twoHeaNode(Node newlftSNode,Node newRighNode) {
        Node newTemp = new Node(-1);
        Node temporary = newTemp;
        while(newRighNode != null && newlftSNode != null) {
            if(newRighNode.data <= newlftSNode.data) {
                temporary.next = newRighNode;
                newRighNode = newRighNode.next;
                temporary = temporary.next;
            }else {
                temporary.next = newlftSNode;
                newlftSNode = newlftSNode.next;
                temporary = temporary.next;
            }
        }
        while(newRighNode != null) {
            temporary.next = newRighNode;
            newRighNode = newRighNode.next;
            temporary = temporary.next;
        }
        while(newlftSNode != null) {
            temporary.next = newlftSNode;
            newlftSNode = newlftSNode.next;
            temporary = temporary.next;
        }
        return newTemp.next;
    }
    public static Node merg(Node head) {
        //base case
        if(head == null || head.next == null) {
            return head;
        }
        //finding mid
        Node mid = getMid(head);

        //finding left and right
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeftHead = merg(head);
        Node newRightHead = merg(rightHead);
        
        //sorting merg
        return twoHeaNode(newLeftHead,newRightHead);
    }
    public static void main(String[] args) {
        
    }
}
