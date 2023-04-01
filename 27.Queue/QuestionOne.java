//Adding elements in Queue using LinkedList

import java.util.*;
import java.util.LinkedList;

public class QuestionOne {
/* 
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

        public static void queueAdd(int data) {
            Node newNode = new Node(data);

            //base case
            if(head == null) {
                head = tail = newNode;
                return;
            }

            //for other case
            tail.next = newNode;
            newNode = tail;
        }

        public static int queueRem(int data) {
            //base case
            if(isEEmmpptty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int value = head.data;
            //if there is single element in queue
            if(head == tail) {
                head = tail = null;
            }else { 
                // for more then one element in queue
                head = head.next;
            }
            return value;
        }


        public static int peak() {
            if(isEEmmpptty()) {
                System.out.println("Queue is full ");
                return -1;
            }
            return head.data;
        }
    }
    */
    public static void main(String[] args) {
        //Queue is implemented in java only eigther linklist or with dequeue
        Queue q = new LinkedList<>(); 
        q.add(0);
        q.add(1);
        q.add(2);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
