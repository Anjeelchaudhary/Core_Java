public class Bina {
    public static int findBinna(int line[],int key){
        int start = 0;
        int end = line.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(line[mid] == key){
                return mid;
            }
            if(line[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
   public static void main(String[] args) {
    int line[] = {1,2,3,4,5,6,7,8,9};
    int key = 5;
    System.out.println("Index key is in = "+findBinna(line, key));

   } 
}
