package Sorting;

public class InsertionSort {
    public static void  calculateInsertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j=i;
            while( j>0 && arr[j-1]>current){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = current;
        }
    }

    public static void printInsertion(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,6,7,9,5,4,3,2,1};
        InsertionSort.calculateInsertion(arr);
        InsertionSort.printInsertion(arr);
    }
}
