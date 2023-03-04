import java.util.Stack;

 //Count Subarrays With Fixed Bounds

public class  SUB {

    public static void countSubarrays(int[] nums, int minK, int maxK) {
        Stack<Integer> st = new Stack<>();   //creation of stack
        int start=0;
        int end =nums.length-1;
        while(start <= end) {
            if(nums[start]>=minK && nums[start]<=maxK) {
                st.push(nums[start]);
            }
            start++;
        }
        System.out.println(st);
    }
    public static void main(String[] args) {
        int nums[] = {1,3,5,2,7,5}, minK = 1, maxK = 5 ;
        countSubarrays(nums, minK, maxK);
    }
}
