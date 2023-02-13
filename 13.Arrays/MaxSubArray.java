

class MaxSubArray{
    public static void calcMax(int array[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                currSum = 0;
                for(int k=i;k<j;k++){
                    currSum += array[k];
                } 
                if(maxSum<currSum){
                    maxSum = currSum;
                    System.out.print(maxSum+" ");
                }
            }
            System.out.println( " ");
        }
        System.out.println("Maximum sum is = "+maxSum);
    }
    public static void main(String[] args) {
        int array[]= {1,2,3,4,5,6};
        calcMax(array);
    }
}