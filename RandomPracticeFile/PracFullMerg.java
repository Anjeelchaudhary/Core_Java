public class PracFullMerg {
    public static int calculateMe(int array[] ,int start, int end) {
        if(start >= end) {
            return;
        }

        int mid = start + (end - start)/2;         //divider of the array
        return calculateMe(array, start, mid);     //for left
        return calculateMe(array, mid+1, end);
        return mergMe(array , start , mid , end);
    }

    public static int mergMe(int array[] , int start , int mid ,int end) {
        
    }
}
