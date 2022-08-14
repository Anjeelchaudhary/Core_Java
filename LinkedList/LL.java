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

    //deleting first Node
    public void delFirst(){
        if(head == null){
            System.out.println("The list is null ");
        }
        head = head.next;
    }

    //delete last node
    public void delLast(){
        if(head==null){
            System.out.println("The list is empty ");
        }

        if(head.next==null){
            head=null;
        }

        Node lastNode = head.next;
        Node secondLastNode = head;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next=null;
        
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
