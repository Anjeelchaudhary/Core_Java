public class PracticeMerg {

    //for printing final output 
    public static void printArray_(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void merg(int array[],int si ,int ei) {
        if(si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2; //for dividing array into two array 
        merg(array, si, mid); //for left array
        merg(array, mid+1, ei); //for right array
        Sort(array, si, ei, mid);

    }
    public static void Sort(int array[],int si,int ei,int mid){
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left
        int j = mid+1; //iterator for right
        int k = 0; //iterator for temp

        while(i<=mid && j<=ei){
            if(array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            }else{
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        while(i<=mid) {
            temp[k++] = array[i++];
        }
        while(j<=ei) {
            temp[k++] = array[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++) {
            array[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int array[] = {6,3,9,5,2,8};
        merg(array, 0, array.length-1);
        printArray_(array);
    }

}