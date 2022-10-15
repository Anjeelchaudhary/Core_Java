public class MaxMin{
    int max;
    int min;
         public static Pair getMaxMin(int arrays[],int n){
            Pair maxmin = new Pair();

        //if there is only one number in the array 
        if(n == 1){
            arrays[0] = maxmin.max;
            arrays[0] = maxmin.min;
        }

            if(arrays[0]>arrays[1]){
                arrays[0] = maxmin.max;
                arrays[1] = maxmin.min;
            }
            else{
                arrays[1] = maxmin.max;
                arrays[0] = maxmin.min;
            }

            for(int i=2;i<=arrays.length;i++){

                if(arrays[i]>maxmin.max){
                    maxmin.max = arrays[i];
                }
                else if(arrays[i]<maxmin.min){
                    maxmin.min = arrays[i];
                }
            }
        return maxmin;

    }
    public static void main(String[] args) {
        int arrays[] = {5,10,22,2,25,150,250};
        int arraySize = 7;
        System.out.println("The maximum number is = ");
        System.out.println("The minimum number is = ");
        Pair minmax = getMaxMin(arrays,arraySize);
    }
}