package AlgoForExam;

// import javax.xml.crypto.Data;

public class AlgoQueue {

    public static void queAlgorithm(int queue[], int num) {

        //enqueue or inserting an element in queue
        //base case 
        if(tail >= num-1) {
            System.out.println("Queue is full");
            return;
        }

        //if queue is not full
        tail = tail + 1 ;
        queue[tail] = Data;
        Stop

        //dequeue or deleting an element in queue
        //base case
        if(head = tail = -1) {
            System.out.println("Queue is empty");
            return;
        }

        //if queue is not empty
        int value = queue[Data];
        head = head - 1;
        Stop
    }
    public static void main(String[] args) {
        
    }
}
