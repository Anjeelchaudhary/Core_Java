package Daily;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayToInteger {
    public static void toIntegerSum(int num[],int k) {
        //Converting array into integer form
        int result = 0;
        for(int i=0;i<=num.length-1;i++) {
            result = result * 10 ;
            result = result + num[i];
        }

        //Now adding inter form and k'th value
        result = result + k;
        ArrayList<Integer> al = new ArrayList<>();
        while(result != 0) {
            int finalResult = result % 10;
            result = result / 10;
            al.add(finalResult);
        }
        Collections.reverse(al);
        System.out.println(al);
    }
    

    public static void main(String[] args) {
        int num[] = {1,2,0,0};
        int k = 34;
        toIntegerSum(num, k);
        //This is optimised way
        // LinkedList<Integer> res=new LinkedList<>();
        // int len=num.length-1;
        // while(len>=0 || k>0){
        //     if(len>=0){
        //         k+=num[len--];
        //     }
        //     res.addFirst(k%10);
        //     k/=10;
        // }
        // return res;
    }
}
