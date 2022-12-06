package Arrays.OneDArray;

public class practiceMaxSum {
    public static void calcMaxSum(int array[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                currSum = 0;
                for(int k=i;k<j;k++){
                    currSum += array[k];
                }
                if(maxSum<currSum){
                    maxSum = currSum;
                    System.out.print(maxSum+" ");
                }
            }
        }
        System.out.println("The largest sum of sub array is = "+maxSum);
    }
    public static void main(String[] args) {
        int array[] = {-1,2,3,-2,4,-1,5};
        calcMaxSum(array);
    } 
}
