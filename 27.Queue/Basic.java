import AlgoForExam.Stack;

public class Basic {

    static class Queue {
        static int arra[];
        static int size;
        static int rear;

        //construture
        Queue(int n) {
            arra = new int [n];
            size = n;
            rear = -1;
        }

        //checking array if array is empty or not
        public static boolean isEmpty() {
            return rear == -1;
        }

        //add function
        public static void add(int data) {
            //base case
            if(rear == size-1) {
                System.out.println("Queue is full");
                return;
            }

            //operation
            rear = rear + 1;
            arra[rear] = data;
        }
    }
    public static void main(String[] args) {
        
    }
}
