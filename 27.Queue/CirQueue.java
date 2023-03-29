public class CirQueue {

    //new class for Queue
    public static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;
        //Constructure
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isFulll() {
            //here if size = 3 and where array index is 0 , 1 , 2 and rear is at 2 then (rear+1)%size = 0(here 0 is remainder)
            //rear is at front of front and if rear wants to jump for next step it will found front 
            return (rear+1)%size == front;        
        }

        //adding function in circular Queue
        public static void queAdd(int data) {
            if(isFulll()) {
                System.out.println("Circular Queue is full ");
                return;
            }

            //adding element in empty array
            if(front == -1) {
                front = 0;
            }
            //here if size = 3 and where array index is 0 , 1 , 2 and rear is at 2 then (rear+1)%size = 0(here 0 is remainder)
            rear = (rear+1)%size;  //updating
            arr[rear] = data;
        }

        public static int queRem(int data) {
            if(isFulll()) {
                System.out.println("Queue is full ");
                return -1;
            }

            int result = arr[front];

            // last element delete
            if(rear == front) {
                rear = front = -1;
            }else {
                front = (front +1)%size;
            }
            return result;
        }
    }
    public static void main(String[] args) {
        
    }
}
