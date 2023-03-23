import java.util.*;

public class Histogram {

    public static void calcHistogram(int arrays[]) {
        int maxSize = 0;
        int nxtSmRht[] = new int[arrays.length];
        int nxtSmlft[] = new int[arrays.length];


        //nextSmallerRight
        Stack<Integer> s = new Stack<>();
        for(int i=arrays.length-1;i>=0;i--) {
            while(!s.isEmpty() && arrays[s.peek()] >= arrays[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nxtSmRht[i] = arrays.length;
            }else {
                nxtSmRht[i] = s.peek();
            }
            s.push(i);
        }

        //nextSmallerRight
        s = new Stack<>();  //making stack empty again
        for(int i=0;i<arrays.length;i++) {
            while(!s.isEmpty() && arrays[s.peek()] >= arrays[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nxtSmlft[i] = -1;
            }else {
                nxtSmlft[i] = s.peek();
            }
            s.push(i);
        }

        //finding area of different histogram
        for(int i=0;i<arrays.length;i++) {
            int hight = arrays[i];                           //height which is height of index i
            int width = nxtSmRht[i] - nxtSmlft[i] - 1;    // right - left - 1 OR j-i-1
            int area = hight * width;
            maxSize = Math.max(maxSize, area);            //comparing max size
        }
        System.out.println("The maximum size of Histogram is : "+maxSize);
    }
    public static void main(String[] args) {
        int arrays[] = {2 , 1 , 5 , 6 , 2 , 3};
        calcHistogram(arrays);
    }
}
