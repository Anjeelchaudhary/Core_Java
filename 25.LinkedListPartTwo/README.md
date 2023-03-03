
# DoubleyLinked List

#### # Creating a DoubleyLinked List
[Creating a DoubleyLinked List](https://github.com/Anjeelchaudhary/JavaCode/blob/master/25.LinkedListPartTwo/CycleLinkedList.java)

```
   //Crationg of doubly linkedList
    public class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
```
#

#### # Finding circular Linked LIst 
[CycleLinkedList](https://github.com/Anjeelchaudhary/JavaCode/blob/master/25.LinkedListPartTwo/CycleLinkedList.java)

```
   public static boolean isCycle(int data) {
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
```
#

#### #  adding at first
[adding at first](https://github.com/Anjeelchaudhary/JavaCode/blob/master/25.LinkedListPartTwo/DoubleyLL.java)

```
    public void firstAdd(int data) {
        Node newNode = new Node(data);

        //base case
        if(head == null) {
            head = tail = newNode;
            return;
        }
    
        //workdone
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
        // System.out.println("Total Node in doubley LinedkedList is = "+size);
    }
```
#

    
#### #  removing at first
[removing at first](https://github.com/Anjeelchaudhary/JavaCode/blob/master/25.LinkedListPartTwo/DoubleyLL.java)

```
    public int firstRemove() {
        //base case
        if(head == null) {
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }

        //if there is only one node
        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        //work done
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
```
#

#### #   adding at last
[adding at last](https://github.com/Anjeelchaudhary/JavaCode/blob/master/25.LinkedListPartTwo/DoubleyLL.java)

```
    public void lastAdd(int data) {
        Node newNode = new Node(data);

        //base case
        if(head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        //work done
        size++;
        tail.next = newNode;
        newNode.prev = tail;
        newNode = tail;
    }
```
#


#### #  removing at last
[removing at last](https://github.com/Anjeelchaudhary/JavaCode/blob/master/25.LinkedListPartTwo/DoubleyLL.java)

```
    public int removeLast() {
        //base case
        if(head == null) {
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }

        //if there is single node
        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        //workdone
        int val = tail.data;
        tail.prev = tail;
        tail.next = null;
        size--;
        return val;
    }
```
#

#### #  for printing
[for printing](https://github.com/Anjeelchaudhary/JavaCode/blob/master/25.LinkedListPartTwo/DoubleyLL.java)

```
    public static void printu() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("null"+"  { Size = "+size+" }");
    }
```
#
#### #  MergInList 
[MergInList ](https://github.com/Anjeelchaudhary/JavaCode/blob/master/25.LinkedListPartTwo/MergInList.java)

```
    
    // finding mid
    public static Node getMid(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //MergSort logic
    public Node mergSortFunction(Node head1,Node head2){
        Node dumMergll = new Node(-1);
        Node temp= dumMergll;
        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        //sorting for leftover 
        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        //sorting for leftover 
        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        //because 1st node is node having -1 so to make it garbage value
        return dumMergll.next;
    } 

    //actual calling of function 
    public Node Merg(Node head) {
        //base case
        if(head == null || head.next == null) {
            return head;
        }

        //1st - To find mid node
        Node mid = getMid(head);
        //left and right MergSort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLefttHead = Merg(head);
        Node newRightHead = Merg(rightHead);

        //Merg
        return mergSortFunction(newLefttHead,newRightHead);
    }
```
#