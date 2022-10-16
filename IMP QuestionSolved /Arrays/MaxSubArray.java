public class MaxSubArray {
    public static void calcMaximumSubArr(int array[]){
        int currentMaximumSum =  0;
        int MaximumSum = 0;

        for(int i=0;i<array.length;i++){
            currentMaximumSum = currentMaximumSum + array[i];

            if(currentMaximumSum > MaximumSum){
                MaximumSum = currentMaximumSum;
            }

            if(currentMaximumSum < 0){
                currentMaximumSum = 0;
            }
            System.out.print(currentMaximumSum+" ");
        }
        
    }

   public static void main(String[] args) {
    int array[] = {-2,-1,0,1,2,-4,-6};
    calcMaximumSubArr(array);
   } 
}
