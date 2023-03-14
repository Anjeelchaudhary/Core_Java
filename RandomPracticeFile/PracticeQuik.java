public class PracticeQuik {
    public static void calcquicK(int array[],int startI, int endI) {
        if(startI >= endI) {
            return;
        }

        int partition = quikBolte(array , startI ,endI);
        calcquicK(array, startI, partition-1);  //left side
        calcquicK(array, partition+1, endI);
    }

    public static int quikBolte(int array[] ,int startI,int endI) {
        int pivot = array[endI];
        int i = startI-1;
        
        for(int j=startI;j<endI;j++) {
            if(array[j] <= pivot) {
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        array[endI] = array[i];
        array[i] = temp;

        return i;
    }
    public static void main(String[] args) {
        
    }
}
