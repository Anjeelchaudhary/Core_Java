
public class MaxMin {

    public static  void calcMaxMin(int array[]) {
      int max = 0;
      int min = 0;
      
      for(int i=0;i<array.length;i++) {
        if(array[i] > max) {
            max = array[i];
        }
        if(array[i] < min) {
            min = array[i];
        }
      }

      System.out.println("Max value is : "+max);
      System.out.println("Min value is : "+min);

    }
    public static void main(String[] args) {
        int array[] = {500,200,85,1,0,399,750};
        calcMaxMin(array);
    }
}
