import java.util.LinkedList;

public class RemoveNth {
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

    public static void remNthFromLast(int num) {
        //logic : Size - num + 1
        //calculating size 
        int size = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }
        //If there is only one Node 
        if(num == size) {
            head = head.next;
            return;
        }

        //actual code  {This method only world for counting from lastNode}
        int i = 1;
        int iToFind = size - num;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public static void main(String[] args) {
        RemoveNth ll = new RemoveNth();
        ll.remNthFromLast(3);
    }
}
