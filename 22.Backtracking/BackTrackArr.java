public class BackTrackArr {
    public static void changeArray(int array[],int i,int value) {
        //base case
        if(i == array.length) {
            printTrack(array);
            return;
        }
        // operation
        array[i] = value;
        changeArray(array,i+1,value+1);//function call step 
        array[i] = array[i]-2;//backtracking step
    }

    public static void printTrack(int array[]) {
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int array[] = new int[5];
        changeArray(array, 0, 1);
        printTrack(array);
    }
}