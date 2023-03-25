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

        //remove function
        public static int remove(int data) {
            //base case
            if(isEmpty()) {
                System.out.println("Queue isfull");
                return -1;
            }
            int front = arra[0];
            for(int i=0;i<rear;i++) {
                arra[i] = arra[i+1];
            }
            rear = rear - 1;
            return front;
        }

        //peak function in array
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arra[0];
        }
    }
    public static void main(String[] args) {
        Queue qt = new Queue(5);
        qt.add(1);
        qt.add(2);
        qt.add(3);
        qt.add(4);
        qt.add(5);
        while(!qt.isEmpty()) {
            System.out.println(qt.peek());
            qt.remove(0);
        }
    }
}
