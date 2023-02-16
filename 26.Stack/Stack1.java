import java.util.ArrayList;

public class Stack1 {
    static class Stack {
        static ArrayList<Integer> al = new ArrayList<>();

        //This function only says if the arraylist is empty or not 
        static boolean isEmpty() {
            return al.size() == 0;
        }

        //for adding data in arraylist
        public static void push(int data) {
            al.add(data);
        }

        //for popping out :Note-(Here return type of pop is int because
        // before doing pop we have to return stored data from stack )
        public static int pop() {
            //if arraylist is empty then it will return -1
            if(isEmpty()){
                return -1;
            }

            int top = al.get(al.size()-1);      //1st step : taking out top object
            al.remove(al.size()-1);             // removing top  object
            return top;                         //returning top
        }

        //peek
        public static int peek() {
            //if arraylist is empty then it will return -1
            if(isEmpty()){
                return -1;
            }
            
            return al.get(al.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack stak = new Stack();
        stak.push(1);
        stak.push(2);
        while(!stak.isEmpty()) {
            System.out.println( stak.peek());
            stak.pop();
        }

    }
}
