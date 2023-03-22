public class PracticeBubOne {
    //Sorting function
    public static void calcBubbleSort(int array[]){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j] > array[j+1]){
                    //swap 
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                } 
            }
        }
    }
    //function for printing 
    public static void printSort(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    //main function 
    public static void main(String[] args) {
        int array[] = {5,4,1,3,2};
        calcBubbleSort(array);
        printSort(array);
    } 
}
