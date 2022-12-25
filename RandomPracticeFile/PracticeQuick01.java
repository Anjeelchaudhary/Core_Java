public class PracticeQuick01 {
    public static void calcQuick(int array[],int si,int ei) {
        if(si<=ei) {
            return;
        }
        int quikkk = SortQuick(array,si,ei);//divider
        calcQuick(array, si, quikkk-1);
        calcQuick(array,quikkk+1,ei);
    }
    public static int SortQuick(int array[],int si,int ei) {
        int pivot = array[ei];
        int i = si-1;
        for(int j=si;j<ei;j++) {
            if(array[j]<=pivot) {
                i++;
                //swapping
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        i++;
        int temp = array[pivot];
        array[ei] = array[i];
        array[i] = temp;
        return i;
    }
    public static void printSort(int array[]) {
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {5,4,3,6,9,8,7};
        calcQuick(array,0,array.length-1);
        printSort(array);
    }
}
