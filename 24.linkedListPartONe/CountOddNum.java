import java.util.Scanner;

class CountOddNum {
    //Node class
    public class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;  //head
    public static Node tail;  //tail

    //adding at last function
    public void lastAdd(int data) {
        Node newNode = new Node(data);

        //base case
        if(head == null) {
            head = tail = newNode;
            return;
        }
        //if more than 
        tail.next = newNode;
        tail = newNode;
    }

    //for printing
    public static void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }

    //check only isNumber is even or odd
    public static boolean checkNum() {
        while(head != null) {
            System.out.print(head.data+" -> ");
            if((head.data % 2) == 0 ) {
                head = head.next;
                return false;
            }
            head = head.next;
        } 
        return true;
    }

    public static void main(String[] args) {
        //taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number = ");
        int start = sc.nextInt();
        System.out.print("Enter ending number = ");
        int end = sc.nextInt();

        //object
        CountOddNum ll = new CountOddNum();
        int count = 0;
        for(int i=start;i<=end;i++) {
            ll.lastAdd(i);
            if(checkNum()) {
                count++;
          }
        }
        ll.print();
        System.out.println("Total number of odd number is = "+count);
        sc.close();;
    }
}