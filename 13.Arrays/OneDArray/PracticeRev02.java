package Arrays.OneDArray;

public class PracticeRev02 {
    public static void calcRevo(int arra[]){
        int start = 0;
        int end = arra.length-1;

        while(start<end){
            int temp = arra[start];
            arra[start] = arra[end];
            arra[end] = temp;
            start++;
            end--;
        }
    }
   public static void main(String[] args) {
    int arra[] = {1,5,9,10,15,16,20};
    calcRevo(arra);

    for(int i=0;i<arra.length-1;i++){
        System.out.print(arra[i]+" ");
    }
    System.out.println(" ");
   } 
}
