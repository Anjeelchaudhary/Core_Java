import java.util.LinkedList;

public class RemoveFirst {
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
    public static int  size;//this will give us the size of the linked list

    //function for adding a node at first
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }

  
    //here removing first and last is not working in my program 
    //This method is used to remove the first node in linkedlist
    public int removeFirssta() {
        //this is special cases in removing First Node of the ll
        if(size == 0) {
            System.out.println("LL is emplty ");
        }else if(size == 1){
            int value = head.data;
            head = tail = null;
            return Integer.MIN_VALUE;
        }
        int value = head.data;
        head = head.next;
        return value;
    }

    public int removeLLassta() {
        //special case for removing last node
        if(size == 0) {
            System.out.println("ll is emplty");
            return Integer.MIN_VALUE;
        }else if(size == 1) {
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        Node previous = head;
        for(int i=0;i<size-2;i++) {
            previous = previous.next;
        }



    }
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

    //function for printing a linked list
    public void print() {
        if(head == null) {
            System.out.println("empty linkedList");
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll,itrSearch(3);
        ll.print();
    
    } 
}
