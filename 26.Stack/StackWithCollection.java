import java.util.Stack;

public class StackWithCollection {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        while(!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
