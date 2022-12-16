public class QuickSort {
    //this function for printing final array 
    public static void printQuick(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int array[],int si,int ei){
        //si = sarting index and ei = ending index 
        if(si >= ei){
            return;
        }

        int pIndx = partition(array,si,ei);//last emelemt 
        quickSort(array, si, pIndx-1);//left
        quickSort(array, pIndx+1, ei);//right
    }
    public static int partition(int array[],int si,int ei){
        int pivot = array[ei]; //pivot is last element of an array
        int i = si-1; //to make place for element smaller than pivot

        for(int j=si;j<ei;j++){
            if(array[j] <= pivot){
                i++;
                //swap
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        array[ei] = array[i]; //don't write pivot = array[i] in this line 
        array[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int array[] = {6,3,9,8,2,5};
        quickSort(array, 0, array.length-1);
        printQuick(array);
    }
}
