import java.security.Key;

public class IterSearch {//creating a node
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

     //This method is use to search any value in the ll 
     public static int itrSearch(int key) {
        Node temp = head;
        int i=0;
        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1; //here if the key is not available in ll then -1 will return
    }
    public static void main(String[] args) {
        LindkedList ll = new LindkedList();
        ll.itrSearch(Key);
    }
}
