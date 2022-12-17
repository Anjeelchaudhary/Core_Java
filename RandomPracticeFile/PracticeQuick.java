package RandomPracticeFile;

public class PracticeQuick {

    //for pringting final output
    public static void printArray_(int array[]){
        for(int i=0;i<array.length-1;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void quick(int array[],int si ,int ei) {
        if(si >= ei) {
            return;
        }
        int pIndx = Sort(array, si, ei); 
        quick(array, si,pIndx-1); //for left
        quick(array, pIndx+1, ei); //for right
    }
    public static int Sort(int array[],int si ,int ei) {
        int pivot = array[ei];
        int i = si-1;

        for(int j=si;j<array.length-1;j++){
            if(array[j] < pivot){
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        array[ei] = array[i];
        array[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int array[] = {6,3,9,5,2,8};
        quick(array, 0, array.length-1);
        printArray_(array);
    }
}
