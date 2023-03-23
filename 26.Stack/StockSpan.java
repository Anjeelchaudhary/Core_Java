import java.util.Stack;

public class StockSpan {

    public static void stockSpan(int stock[],int span[]) {
        Stack<Integer> st = new Stack<>();
        //base case
        span[0] = 1;
        st.push(0);
        
        //here we are calculating currentPosition value vs previous value
        for(int i=0;i<stock.length;i++) {
            int currentPrice = stock[i];
            while(!st.isEmpty() && currentPrice > stock[st.peek()]) {
                st.pop(); //if there is smaller value than currentPrice
            }
            //if in case we have pop all the element from stack
            if(!st.isEmpty()) {
                span[i] = i+1;
            }else {
                int prevHeight = st.peek();
                span[i] = i - prevHeight;
            }

            st.push(i);
        }
    }

    public static void main(String[] args) {
        int stock[] = {100,80,60,70,60,85,100};
        int span[] = new int[stock.length];
        stockSpan(stock ,span);
        for(int i=0;i<span.length;i++) {
            System.out.print(span[i]+" ");
        }System.out.println();
    }
}
