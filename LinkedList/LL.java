package LinkedList;

public class LL {
    Node head;

    //created a node
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    //add a node at first 
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
        }
        newNode.next=head;
        head=newNode;
    }

    //add a node at last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
        }
        Node currnNode = head;
        while(currnNode.next!=null){
            currnNode=currnNode.next;
        }
        currnNode=newNode;
    }

    //for printing 
    public void printList(){
        if(head == null){
            System.out.println("The list is empty ");
        }
        Node currnNode = head;
        while(currnNode!=null){
            System.out.print(currnNode.data+" -> ");
            currnNode=currnNode.next;
        }
        System.out.print("NULL");;
    }
        


    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
    }
}
