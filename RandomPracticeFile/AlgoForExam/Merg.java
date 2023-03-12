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
        
    }

    public static void main(String[] args) {
        
    }
}
