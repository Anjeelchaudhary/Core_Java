public class LinkedList {
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
    int size = 0;

    //adding first Node
    public void firstAddition(int data) {
        Node newNode = new Node(data);
        
        //if there is only one Node
        if(head == null) {
            head = tail = newNode;
            return;
        }

        size++;
        //if there is more than one Node in list
        newNode.next = head;
        head = newNode;

    }

    //removing first Node
    public int firstRemove(int data) {
        //base case
        if(size == 0) {
            System.out.print("LinkedList is empty ");
        }else if(size == 1) {
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        //actual work
        int value = head.data;
        head = head.next;
        return value;
    }

    //adding at last
    public void lastAddition(int data) {
        Node newNode = new Node(data);

        //customSize_Calcultor
        int sizze = 0;
        Node locator = head;
        while(locator != null) {
            locator = locator.next;
            sizze++;
        }
       

        //base case
        if(head == null) {
            head = tail = newNode;
        }

        //actual work
        tail.next = newNode;
        tail = newNode;

    }

    //removeLast 
    //for removeing last Node customSizeCalculating method is war farbetter
    public int lastRemove(int data) {
        int sz = 0;
        Node locator = head;

        //for custom sizeCalculator
        while(locator != null) {
            locator = locator.next;
            sz++;
        }

        //base case
        if(sz == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }else if(sz == 1) {
            int Value = head.data;
            head = tail = null;
            sz--;
            return Value;
        }

        //actual work
        Node previous = head;
        for(int i=0;i<sz-2;i++) {
            previous = previous.next;
        }
        int value = previous.next.data;
        previous.next = null;
        tail = previous;
        sz--;
        return value;
    }

    //adding at Middle should be declare as Node Not eighther int or void
    public Node middleAddition(int data) {
        Node newNode = new Node(data);
        Node slow = head;
        Node fast = head;

        //intial state
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        size++;
        //actual work
        newNode.next = slow.next;
        slow.next = newNode;
        return newNode;
    }

    //printing all nodes
    public static void print() {
        if(head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //iterative search 
    public void iterativeSearch(int number) {

        //customSize_Calcultor
        int sz = 0;
        Node locator = head;
        while(locator != null) {
            locator = locator.next;
            sz++;
        }
        //base case
        if(head == null) {
            System.out.println("LinkedList is empty ");
        }
        //actual work
        Node temp = head;
        for(int i=0;i<sz;) {
            if(temp.data == number) {
                System.out.println(temp.data+" : Found in linkedlist");
            }
            temp = temp.next;
            return;
        }
    }
    //connecting last node to the middleNode 
    public static void isConnected() {
        //base case
        if(head == null) {
            return ;
        }

        //work done

        //finding middleNode
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //finding lastNode
        Node last = head;
        while(last != null) {
            last = last.next;
        }
        //Connectin lastNode to middleNode
        last.next = slow;
    }

    //To check cycle in linkedList
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    //removing cycleIn ll 
    public static void cycle() {
        Node slow = head;
        Node fast = head;
        boolean circleCycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                circleCycle = true;
                break;
            }
        }
        //base case
        if(circleCycle == false) {
            return;
        }

        Node previous = fast;
        slow = head;
        while(slow != fast) {
            previous = fast;
            slow = slow.next;
            fast = fast.next;
        }
        previous.next = null;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.firstAddition(2);
        ll.print();
        ll.firstAddition(1);
        ll.print();
        ll.firstAddition(3); 
        ll.print();
        ll.lastAddition(4);
        ll.print();
        ll.middleAddition(9);
        ll.print();
        ll.firstRemove(1);
        ll.print();
        ll.lastRemove(4);
        ll.print();
        ll.firstAddition(7);
        ll.print();
        ll.lastAddition(8);
        ll.print();
        ll.iterativeSearch(2);
        System.out.println(isCycle());
     }
}
