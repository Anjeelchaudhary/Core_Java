//Adding elements in Queue using LinkedList

public class QuestionOne {

    //Class for node
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //class for Queue
    public static class Queue {
        static Node head = null;
        static Node tail = null;

        //if queue is empty 
        public static boolean isEEmmpptty() {
            return head == null && tail == null;
        }


    }
    public static void main(String[] args) {
        
    }
}
