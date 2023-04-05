import java.util.*;

public class QuestionTwo {

    //new class
    static class Queue {
        static Stack<Integer> st1 = new Stack<>();
        static Stack<Integer> st2 = new Stack<>();

        public static boolean isEmpty() {
            return st1.isEmpty();
        }

        //adding an element
        public static void adding(int data) {
            //here until stack1 is not empty, simply we pop an element and store it into stack2 
            while(!st1.isEmpty()) {
                st2.push(st1.pop());
            }

            //2nd step
            st1.push(data);

            //3rd step
            while(!st2.isEmpty()) {
            //here until stack2 is not empty, simply we pop an element and store it into stack1 
                st1.push(st2.pop());
            }
        }

        //removing an element to form a queue
        public static int removing() {
            //base case
            if(st1.isEmpty()) {
                System.out.println("Queue is empty ");
                return -1;
            }

            //at last remove all element from stack1
            return st1.pop();
       }

       public static int peeking() {
        //base case
        if(st1.isEmpty()) {
            System.out.println("Queue is empty ");
            return -1;
        }

        //at last remove all element from stack1
        return st1.peek();
       }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.adding(1);
        q.adding(2);
        q.adding(3);
        while(!q.isEmpty()) {
            System.out.println(q.peeking());
            q.removing();
        }
    }
}
