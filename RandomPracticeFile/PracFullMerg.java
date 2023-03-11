public class PracFullMerg {
    public static void calculateMe(int array[] ,int start, int end) {
        if(start >= end) {
            return;
        }

        int mid = start + (end - start)/2;         //divider of the array
        calculateMe(array, start, mid);     //for left
        calculateMe(array, mid+1, end);     //for right
        mergMe(array , start , mid , end);  //for cacluation
    }

    public static void mergMe(int array[] , int start , int mid ,int end) {
        int temppo[] = new int[start+end+1];
        int i=start;
        int j=mid+1;
        int k=0;

        while(i <= mid && j <= end) {
            if(array[i] < array[j]) {
                temppo[k] = array[i];
                i++;
            }else {
                temppo[k] = array[j];
                j++;
            }
            k++;
        }

        while(i <= mid) {
            temppo[k++] = array[i++];
        }

        while(j <= end) {
            temppo[k++] = array[j++];
        }

        for(k=0,i=start;k<temppo.length;k++,i++) {
            array[i] = temppo[k];
        }
    }
    public static void main(String[] args) {
        
    }
}
