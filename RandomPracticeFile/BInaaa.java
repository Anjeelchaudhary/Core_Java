public class BInaaa {
    public static int calcBinaahh(int arra[],int key){
        int start = 0;
        int end = arra.length-1;

        while(start<=end){
            int mid = (start + end )/ 2;

            if(arra[mid]==key){
                return mid;
            }if(arra[mid]<key){
                start = mid+1;
            }if(arra[mid]>key){
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arra[] = {1,2,3,4,5,7,8,9};
        int key = 4;
        calcBinaahh(arra,key);

    }
}
