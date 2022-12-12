package Sorting;

public class InsertionSort {
    public static void calcInsertionSort(int array[]){
        for(int i=1;i<array.length;i++){
            int current = array[i];
            int previous = i-1;
            while(previous >=0 && array[previous] > array[current]){
                array[previous + 1] = array[previous];
                previous--;
            }
            array[previous+1] = array[current];
        }
    }
    public static void PrintSorting(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {5,4,1,3,2};
        calcInsertionSort(array);
        PrintSorting(array);
    } 
}
