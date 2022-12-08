package Arrays.OneDArray;

public class PracticeKadan {
    public static void calcKaddu(int array[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
            cs = cs +array[i];
            if(cs < 0){
                cs = 0;
            }
            System.out.println("current sums are : "+cs);
            ms = Math.max(ms, cs);
        }
        System.out.println("Maximum sum is = "+ms);
    }
   public static void main(String[] args) {
    int array[] = {-1,-2,-3,-4,5,6,-7,10};
    calcKaddu(array);
   } 
}
