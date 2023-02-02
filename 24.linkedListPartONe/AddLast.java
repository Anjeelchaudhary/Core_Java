public class AddLast {
    public static class Node {
        int data;
        Node next;
         Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static  Node head;
    public static  Node tail;

    public static void addinLogic(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        System.out.println(tail.next.data+" added ");
        tail = newNode;
    }
    //print
    public static void print() {
        Node temp = head;

        if(head == null) {
            System.out.println("LL is empty ");
            return;
        }
        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        AddLast ll = new AddLast();
        ll.addinLogic(1);
        ll.print();
        ll.addinLogic(2);
        ll.print();
        ll.addinLogic(3);
        ll.print();
        ll.addinLogic(4);
        ll.print();
        
    }   
}
