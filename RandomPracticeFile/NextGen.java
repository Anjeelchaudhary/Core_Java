
import java.util.Stack;

public class NextGen {

    public static void greaterElement(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int nextGen[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--) {

            //base case
            //arr[st.peek()] is done because weHave stored index of array not value of array in stack
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            //if while loop has made empty stack
            if(st.isEmpty()) {
                nextGen[i] = -1;
            }else {
                //arr[st.peek()] is done because weHave stored index of array not value of array in stack
                nextGen[i] = arr[st.peek()];
            }

            st.push(i);
        }   

        for(int i=0;i<=nextGen.length-1;i++) {
            System.out.print(nextGen[i]+" ");
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        int arr[] = {6 , 8 , 0 ,1 , 3};
        greaterElement(arr);

        //nextGreater Right <-this program
        //nextGreater Left  <-inverse the for loop
        //nextSmaller Rigth <-change the condition for while loop as greater than
        //nextSmaller Left 
    }
}