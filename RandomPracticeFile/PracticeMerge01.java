

public class PracticeMerge01 {
    public static void calcMerg(int array[],int startingI ,int endingI) {
        //if there is single element in the array
        if(startingI <= endingI) {
            return;
        }
        int midPole = startingI + (endingI - startingI)/2 ;//mid
        calcMerg(array,startingI,midPole);//left
        calcMerg(array,midPole+1,endingI);//right
        Merg(array,startingI,endingI,midPole);
    }
    //actual sorting code 
    public static void Merg(int array[],int startingI,int endingI,int midpole) {
        int temp[] = new int[endingI-startingI+1];
        int i = startingI;
        int j = midpole+1;
        int k = 0;
        while(i <= midpole && j <=endingI) {
            if(array[i] < array[j]) {
                array[k] = array[i];
                i++; 
            }else {
                array[k] = array[j];
                j++;
            }
            k++;
        }
        while(i<=midpole) {
            temp[k++] = array[i++];
        }
        while(j<=endingI) {
            temp[k++] = array[j++];
        }
        for(k=0,i=startingI;k<array.length;k++,i++) {
            array[i] = temp[k];
        }

    }
    //This function for display 
    public static void printArr(int array[]) {
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {5,4,2,6,9,8};
        calcMerg( array, 0 , array.length-1);
        printArr(array);

    }
}
