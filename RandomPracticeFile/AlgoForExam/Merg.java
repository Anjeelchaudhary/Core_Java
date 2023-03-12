package AlgoForExam;

public class Merg {
    public static void calculation(int array[],int startI ,int endingI) {
        //base case
        if(startI >= endingI) {
            return;
        }
        
        int mid =startI + (endingI - startI) / 2;  //finding Mid
        calculation(array, startI, mid);           //sorting for left
        calculation(array, mid+1, endingI);        //sorting for right
        calcMerg(array , startI , mid , endingI);  //actural sorting
    }

    public static void calcMerg(int array[] ,int startI ,int mid ,int endingI) {
        int temp[] = new int[endingI-startI+1];  //temporary array for storing value
        int i = startI; //for tracking right side array
        int j = mid+1;  //for tracking left side array
        int k= 0;       //for tracking temporary array

        //for comparing left array and right array 
        //and storing it in temporary array
        while(i <= mid && j <= endingI) {
            if(array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            }else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        //adding remaining value of right array int temporary array
        while(i <= mid) {
            temp[k++] = array[i++];
        }

        //adding remaingin value of left array in temporary array 
        while(j <= endingI) {
            temp[k++] = array[j++];
        }

        //adding values in real array from temporary array
        for(k=0,i=startI;k<temp.length;k++,i++) {
            array[i] = temp[k];
        }
    }

    public static void printing(int array[]) {
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }System.out.println();
    }

    public static void main(String[] args) {
        int array[] = {6,3,9,5,2,8};
        calculation(array, 0, array.length-1);
        printing(array);
    }
}
