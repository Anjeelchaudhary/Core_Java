

import java.util.ArrayList;

public class DubRem {
    static int isRepeated(int num[]) {
        ArrayList<Integer> al = new ArrayList<>();
        int size =0;
        for(int i=0;i<num.length;i++) {
            al.add(i, null);
            for(int j=i+1;j<num.length-2;j++) {
                if(num[i] == num[j]) {
                    size++;
                }
            }
        }
        int totalVal = num.length - size;
        System.out.println(totalVal);
        return size;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        isRepeated(nums);
    }
}
