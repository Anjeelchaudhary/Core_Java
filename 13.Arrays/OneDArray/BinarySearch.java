package Arrays.OneDArray;

public class BinarySearch {
    public static int findBinary(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;

        while(start<=end){
            int mid = (start+end) / 2;

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {1,5,9,7,3,6,4,2,8};
        int key = 2;
        System.out.println("The number for index is : "+findBinary(numbers, key));
    } 
}
