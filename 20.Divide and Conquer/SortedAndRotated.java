public class SortedAndRotated{
    public static int Search(int array[],int key,int si,int ei) {
        int mid = si+(ei-si)/2;

        if(array[mid]==key) {
            return mid;
        }
        if(array[si]<=array[mid]) {
            if(array[si]<=key && key<=array[mid]) {
                return Search(array, key, si, mid-1);
            }else {
                return Search(array, key, mid+1, ei);
            }
        }
        else{
            if(array[mid]<=key && key<=array[ei]) {
                return Search(array, key, mid+1, ei);
            }else {
                return Search(array, key, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int array[] = {4,5,6,7,0,1,2};
        int key = 0;
        int Indexes = Search(array, key, 0, array.length-1);
        System.out.println("Your value lies in Index : "+Indexes);
    }
}

//This is optimized Binary search 