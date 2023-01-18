public class AddFist {
    public class LinkAddFirst {
        int data;
        LinkAddFirst next;
        void LinkAddFirst(int data) {
            this.data = data;
            this.next = next;
        }
    }
    public static LinkAddFirst head;
    public static LinkAddFirst tail;
    
    public static addFirst(int data) {
        //first step = crete a new node
        LinkAddFirst newNode = new LinkAddFirst(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        //second step = newNode next = head
        newNode.next = head;

        //third step = newNode
        head = newNode;
        
    }
    public static void main(String[] args) {
        
    }
}
