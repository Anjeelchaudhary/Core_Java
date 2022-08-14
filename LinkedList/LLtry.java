package LinkedList;

public class LLtry {
    Node head;

    //created a empty node 
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }

    }

    //adding the node at first in the link 
    public void addFirst(String data){
        Node newNode = new Node(data);

        if(head==null){
           head=newNode;
        }
        newNode.next=head;
        head=newNode;
    }

    //adding the node at last in the link
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }

        //here at fist we need to say that head is on currentNode 
        Node currnNode =head;
        while(currnNode.next!=null){
            currnNode=currnNode.next;
        }
        currnNode=newNode;
    }

    //for printing a linklist
    public void printf(LLtry list){
    if(head==null){
        System.out.println("NUll");
        return;
    }
    Node currnNode=head;
    while(currnNode!=null){
        System.out.print(" -> ");
        currnNode=currnNode.next;
    }
    System.out.println("null");
}

    public static void main(String[] args){
        LLtry list = new LLtry();
        list.addFirst("a");
        list.addFirst("is");
        list.printf(list);
    }
}
