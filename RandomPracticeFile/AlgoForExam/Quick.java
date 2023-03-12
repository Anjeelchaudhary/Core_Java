package AlgoForExam;

public class Quick {

    public static void calcQuick(int array[], int startI,int endI) {
        //base case
        if(startI >= endI) {
            return;
        }

        int partition = quickPartition(array,startI,endI);   //work as divider pole for small values and large values
        calcQuick(array, startI, partition-1);            //Sorting for small values ie left side
        calcQuick(array, partition+1, endI);              //Sorting for large values ie right side
    }

    public static int quickPartition(int array[],int startI ,int endI) {
        int pivot = array[endI];       //making last element as pivot
        int i = startI-1;              //stays just infront of starting index

        for(int j=startI;j<endI;j++) {
            if(array[j] <= pivot) { 
                i++;                 //at first i was at -1 position so to bring i to 0th +1 is done
                int temp = array[j];   //let say j value is removed from its place
                array[j] = array[i];   //
                array[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        array[endI] = array[i];
        array[i] = temp;

        return i;
    }

    public static void printing(int array[]) {
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {6,3,9,8,2,5};
        calcQuick(array, 0, array.length-1);
        printing(array);
    }
}
