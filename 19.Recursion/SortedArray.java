public class SortedArray {
    public static boolean checkSorted(int array[],int i) {
        if(i == array.length-1) {
            return true;
        }

        if(array[i] > array[i+1]) {
            return false;
        }
        return checkSorted(array,i+1);
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        System.out.println(checkSorted(array, 0));
    }
}
