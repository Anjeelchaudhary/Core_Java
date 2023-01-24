import java.security.Key;
import java.util.LinkedList;

public class RecSearch {
    //creating a node
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
  
    public static int helper(Node head,int key) {
        if(head == null) {
            return -1;
        }
        //here if the key is found in the head then 0 wil return current head which will
        //be index 0
        if(head.data == key) {
            return 0;
        }
        int indx = helper(head.next, key);
        if(indx == -1) {
            return -1;
        }
        return indx+1;
    }
    public static int recuSearch(int key) {
        return helper(head, key);
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        System.out.println(ll.recuSearch(3));
    }
}
