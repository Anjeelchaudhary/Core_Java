package Daily;

class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        //Binary Search Algo
        while(left<= right){
            int mid = left + (right-left)/2;

            // if target is found return its index
            if(nums[mid] == target) return mid;

            else if(nums[mid] > target) right = mid-1;
            else left = mid+1;

        }
        //returning left index as it contains the position where it would be if it were inserted in order.
        return left;
    }
    public static void main(String[] args) {
        int  nums[] = {1,3,5,6}, target = 5;
        System.out.println(searchInsert(nums,target));
    }
}