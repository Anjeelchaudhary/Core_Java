public class Recursion {
    //for factorial 
    public static int factorial(int number) {
        //base case
        if (number == 0) {
            return 1;
        } 
        //work done 
        int fact = number * factorial(number-1);
        return fact;
    }
    //for fibbonacy
    public static int fibbonacy(int number) {
        //base case
        if(number == 0 || number == 1) {
            return number;
        }
        int temp =  fibbonacy(number-1) + fibbonacy(number-2);
        return temp;
    }

    //checkIf arraySorted
    public static boolean calcSort(int array[],int i) {
        //base case
        if(i == array.length-1){
            return true;
        }
        //workdone
        if(array[i] > array[i+1]){
            return false;
        }
        return calcSort(array, i+1);
    }

    //FirstOccurence
    public static int firstOccurence(int array[],int i,int key) {
        //base case
        if(i == array.length) {
            return -1 ;
        }

        //workdone
        if(array[i] == key) {
            return i;
        }

        return firstOccurence(array, i+1, key);
    }
    public static void main(String[] args) {
        System.out.println("factorial : "+factorial(5));
        System.out.println("fibbonacy : "+fibbonacy(5));
        int array1[] = {1,2,3,4,6,5};
        System.out.println(calcSort(array1,0));
        System.out.println(firstOccurence(array1, 0, 5));
    }
}
