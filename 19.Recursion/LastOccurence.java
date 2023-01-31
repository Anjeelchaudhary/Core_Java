public class LastOccurence {
    public static int occur(int array[],int i ,int key) {
        if(i == array.length) {
            return -1;
        }
        int isFound = occur(array,i+1,key);
        if(isFound == -1 && array[i]== key ) {
            return i;
        }
        return isFound;

    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,5,6,7,8,9,10};
        System.out.println(occur(array, 0, 5));
    }
}
