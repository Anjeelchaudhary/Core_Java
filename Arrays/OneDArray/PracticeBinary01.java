package Arrays.OneDArray;

class PracticeBinary01{
    public static int caclBinary01(int arrays[],int key){
        int start = 0;
        int end = arrays.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(arrays[mid]==key){
                return mid;
            }if(arrays[mid]<key){
                start = mid+1;
            }if(arrays[mid]>key){
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arrayss[] = {1,2,3,4,5,6,9,10,15,19};
        int key = 9;
        System.out.println("The given number found in "+caclBinary01(arrayss, key)+"th term");
    }
}