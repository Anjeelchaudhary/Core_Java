package Arrays.OneDArray;

public class Kadan {
    public static void calcKadan(int array[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            currSum = currSum + array[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("The maximum Sum is = "+maxSum);
    }
    public static void main(String[] args) {
        int array[] = {-1,-2,3,4,-5,6,7};
        calcKadan(array);
    }
}
