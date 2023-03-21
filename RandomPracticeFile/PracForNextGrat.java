import java.util.*;

public class PracForNextGrat {

    public static void calcMyGreater(int array[]) {
        Stack<Integer> stk = new Stack<>();
        int arr1[] = new int[array.length];

        for(int i=array.length-1;i>=0;i--) {

            while(!stk.empty() && array[stk.peek()]<= array[i]) {
                stk.pop();
            }

            if(stk.empty()) {
                arr1[i] = -1;
            }else {
                arr1[i] = array[stk.peek()];
            }
            stk.push(i);
        }
        for(int i=0;i<arr1.length-1;i++) {
            System.out.print(arr1[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {6 , 8 , 0 , 1 , 3};
        calcMyGreater(array);
    }
}
