
# DoubleyLinked List


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