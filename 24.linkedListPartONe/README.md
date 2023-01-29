#### # Creating a Node 
```
public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

public static Node head;  //Making head of the Node
public static Node tail;  //Making tail of the Node
```
#

Code for 
[adding Node at first ](https://github.com/Anjeelchaudhary/JavaCode/blob/master/24.linkedListPartONe/AddFist.java)
#### # Adding node at first

```
    public static void adding(int data) {
        //step1:-creating a node
        Node newNode = new Node(data);
    
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //step2:-newNode pointing towards head
        newNode.next = head;

        //newNode becomes the head node
        newNode = head;
    }
```
#
Code for 
[AddingMiddle](https://github.com/Anjeelchaudhary/JavaCode/blob/master/24.linkedListPartONe/FindMid.java)

#### # Adding Node at Middle

```
 public Node middleFind(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // here slow is the midNode in linkedList
    }
```
#
Code for 
[addLast](https://github.com/Anjeelchaudhary/JavaCode/blob/master/24.linkedListPartONe/AddLast.java)

#### # Adding Node at last

```
   public static void addinLogic(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
```
#
Code for 
[Iterative search](https://github.com/Anjeelchaudhary/JavaCode/blob/master/17.BItManupulataion/PowerOfNum.java)

#### # Iterative search in LinkedLIst

```
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
```
#
Code for 
[Printing Nodes](https://github.com/Anjeelchaudhary/JavaCode/blob/master/24.linkedListPartONe/PrintingList.java)

#### # Printing Nodes in linkedList

```
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
```
#
Code for 
[Recursive Search ](https://github.com/Anjeelchaudhary/JavaCode/blob/master/24.linkedListPartONe/RecSearch.java)

#### # Recursive Search in LinkedLIst

```
  public static int helper(Node head,int key) {
        if(head == null) {
            return -1;
        }
        //here if the key is found in the head then 0 wil return current head which will
        //be index 0
        if(head.data == key) {
            return 0;
        }
        int indx = helper(head.next, key);
        if(indx == -1) {
            return -1;
        }
        return indx+1;
    }
    public static int recuSearch(int key) {
        return helper(head, key);
    }
```
#

Code for 
[removing first Node](https://github.com/Anjeelchaudhary/JavaCode/blob/master/24.linkedListPartONe/RemoveFirst.java)
#### # removing first Node

```
    public int removeFirst() {
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
```
#
Code for 
[removing last Node](https://github.com/Anjeelchaudhary/JavaCode/blob/master/24.linkedListPartONe/RemoveFirst.java)

#### # removing last Node

```
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
        int value = previous.next.data;
        previous.next = null;
        tail = previou;
        size--;
        return value;
    }
```
#
Code for 
[Removeing Nth Node](https://github.com/Anjeelchaudhary/JavaCode/blob/master/24.linkedListPartONe/RemoveNth.java)

#### # Removeing Nth Node from last

```
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
```

Code for 
[Reversering linkedlist](https://github.com/Anjeelchaudhary/JavaCode/blob/master/24.linkedListPartONe/Reversell.java)

#### #  Reversering linkedlist

```
   public static void revLinkedlist() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }
```
#
Code for 
[Finding Mid Node](https://github.com/Anjeelchaudhary/JavaCode/blob/master/17.BItManupulataion/PowerOfNum.java)

#### # Finding Mid Node

```
   public Node middleFind(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // here slow is the midNode in linkedList
    }
```
#
Code for 
[Finding Pallindrome in LinkedLIst](https://github.com/Anjeelchaudhary/JavaCode/blob/master/24.linkedListPartONe/Pllindrome.java)

#### # Finding Pallindrome in LinkedLIst

```
    public Node middleFind(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // here slow is the midNode in linkedList
    }

    public boolean calcPalindrome() {
        //if there is single node or empty node
        if(head == null && head.next == null) {
            return true;
        }

        Node midd = middleFind(head);

        Node prev = null;
        Node curr = midd;
        Node next ;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //left side head
        Node left = head;  //right side head

        while(right != null) {
            if(right.data != right.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
```
#
Code for 
[Recursive Search ](https://github.com/Anjeelchaudhary/JavaCode/blob/master/24.linkedListPartONe/RecSearch.java)

#### # Recursive Search in LinkedLIst

```
  public static int helper(Node head,int key) {
        if(head == null) {
            return -1;
        }
        //here if the key is found in the head then 0 wil return current head which will
        //be index 0
        if(head.data == key) {
            return 0;
        }
        int indx = helper(head.next, key);
        if(indx == -1) {
            return -1;
        }
        return indx+1;
    }
    public static int recuSearch(int key) {
        return helper(head, key);
    }
```