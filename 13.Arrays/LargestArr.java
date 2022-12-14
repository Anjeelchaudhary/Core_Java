package Arrays.OneDArray;

class LargestArr{
    public static int fingLargeNum(int num[]){
        int large = Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            if(num[i]>large){
                large=num[i];
            }
        }
        return large;
    }

    public static void main(String[] args) {
        int numbers[] = {1,5,4,3,6,7,9,8};
        System.out.println("The largest number in the array is : "+fingLargeNum(numbers));

    }
}