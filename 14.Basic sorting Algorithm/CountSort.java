package Sorting;

public class CountSort {
    public static void calcCount(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            largest = Math.max(largest, array[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0;i<array.length;i++){
            count[array[i]]++;
        }

        int j=0;
        for(int i=0;i<array.length;i++){
            while(count[i]>0){
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void print(int array[]){
       for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
       }
       System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {1,4,1,3,2,4,3,7};
        calcCount(array);
        print(array);

    }
}
