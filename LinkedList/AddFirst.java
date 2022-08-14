package LinkedList;

public class AddFirst {
    
    Node head;
    private int size;
    
    //for size
    AddFirst () {
        size = 0;
    }
    //created a node
    public class Node {
        String data;
        Node next;
  
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //adding a node at first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    //adding a node at last
    public void addLast(String data) {
        Node newNode = new Node(data);
  
        if(head == null) {
            head = newNode;
            return;
        }
  
        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
  
        lastNode.next = newNode;
    }
    //printing all nodes
    public void printList() {
        Node currNode = head;
  
        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
  
        System.out.println("null");
    }
    
    //remove a node from first
    public void removeFirst() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
  
        head = this.head.next;
        size--;
    }
    
    //remove a node from last
    public void removeLast() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
  
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
  
        Node currNode = head;
        Node lastNode = head.next;

        while(lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
  
        currNode.next = null;
    }
    
    //getting a size of list
    public int getSize() {
        return size;
    }
  
  
    //main function
    public static void main(String args[]) {
        AddFirst list = new AddFirst();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();
  
        list.addFirst("this");
        list.printList();
        list.printList();
 
        list.removeLast();
        list.printList();
    }
 }
