public class PracticeSortedNRotated {
    public static int AdvancedBinary(int array[],int key,int si,int ei) {
        int mid = si + (ei - si) / 2;

        if(array[mid] == key) {
            return mid;
        }

        if(array[si]<=array[mid]) {
            if(array[si]<=key && key<=array[mid]) {
                return AdvancedBinary(array,key,si,mid-1);
            }else {
                return AdvancedBinary(array,key,mid+1,ei);
            }
        }
        else {
            if(array[mid+1]<=key && key<=array[ei]) {
                return AdvancedBinary(array,key,mid+1,ei);
            }else {
                return AdvancedBinary(array, key, si, mid-1);
            }
        }
    }
   
    public static void main(String[] args) {
        int array[] = {4,5,6,7,0,1,2};
        int key = 1;
        int index = AdvancedBinary(array,key,0,array.length-1);
        System.out.println("Your number lies in index : "+index);

    }
}
