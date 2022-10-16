public class Reverse {
    public static void  calcRevrse(int array[],int starting,int ending){
        int temp;

        ///reverse can be done only in sorted array 


        while(starting < ending){
            temp = array[starting];
            array[starting] = array[ending];
            array[ending] = temp;
            starting++;
            ending--;
        }   
    }
    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8};
        calcRevrse(array, 0, 7);
        System.out.println("After reversing an array ");
        printArray(array);
        
    } 
}
