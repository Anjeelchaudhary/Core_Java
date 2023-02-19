import java.util.Stack;

public class LastPush {
    public static void pushAtLast(Stack<Integer> st ,int data) {
        //base case
        if(st.isEmpty()) {
            st.push(data);
            return;
        }

        //other case
        int top = st.pop();  //first poping out last data i.e = 3 /2  /1
        pushAtLast(st,data);  //reversive
        st.push(top);        //again filling in stack i.e = 1 /2 /3 
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        pushAtLast(st, 4);

        while(!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
        

    }
}
