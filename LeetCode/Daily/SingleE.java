package Daily;


public class SingleE {
    public static int singleNonDuplicate(int[] nums) {
        int i = 0;
        int length = nums.length-1;
        //base case
        // if(length==0 || length==1) {
        //     return nums[i];
        // }

        // workdone
        while(i <= length) {
            if(i == length) {
                return nums[i];
            }
            else if(nums[i]!=nums[i+1]) {
                return nums[i];
            }
            i+=2;
        }
        return -1;
    }
    public static void main(String[] args) {
        // int nums[] = {1,1,2,3,3,4,4,8,8};
        // int nums[] = {3,3,7,7,10,11,11};
        int nums[] = {};
        // int nums[] = {1,1,2};
        int ouput = singleNonDuplicate(nums);
        System.out.println(ouput);
        
    }
}
