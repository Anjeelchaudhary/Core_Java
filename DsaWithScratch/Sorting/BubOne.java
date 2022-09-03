package Sorting;

public class BubOne {
    public static void printSorting(int[] array){

        for(int i=0;i<=array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        int array[] = {6,8,9,5,2,4,7,3,1};

        //Bubble sorting

        for(int i=0;i<=array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    //swapping
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                }
            }
        }
        printSorting(array);
    }
}