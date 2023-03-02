import java.util.*;

public class Basic {
    public static void main(String[] args) {
        //creation of stack 
        Stack<Integer> st = new Stack<>();

        //for insertion
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        //for deleting top(or last value)
        // st.pop();
        // st.pop();
        // System.out.println(st);

        //this works similar as poping single element at every step and printing it
        while(!st.isEmpty()) {
            System.out.println(st);
            st.pop();
        }

    }
}
