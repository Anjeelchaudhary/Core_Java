package AlgoForExam;

public class Binary {
    public static int binaa(int array[],int recNum) {
        int start = 0;               //starting from 0
        int end = array.length-1;    //if start was 1 then we will have done array.length only 

        while(start <= end) {
            int midValue = start + (end  - start) / 2;    //this method gives optimal value rather than (start+end)/2

            //base case if RequiredNumber found in middle of the array
            if(array[midValue] == recNum) {
                return midValue;
            }

            //if the RequiredNumber is smaller than midValue
            if(array[midValue] > recNum) {
                end = midValue-1;
            }else {
                start = midValue+1;             //if the RequirdNumber is larger than midValue
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        int recNum = 9;
        System.out.println("The required number found in index : "+binaa(numbers, recNum));
    }
}
