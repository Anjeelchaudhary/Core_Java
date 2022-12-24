import java.util.Scanner;

public class PracticeBitOddEven {
    public static void EvenOddBit(int array[]) {
        int num1 = 1;
        for(int i=0;i<array.length;i++) {
            if((array[i] & num1) == 0 ){
                System.out.println(array[i]+" this is even number : ");
            }else {
                System.out.println(array[i]+" This is odd numbers ");
            }
        }
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("What length of array you want to give : ");
       int length = sc.nextInt();
       int array[] = new int[length];

       for(int i=0;i<length;i++) {
            System.out.print("What is the value at "+i+" : ");
            array[i] = sc.nextInt();
       }
       System.out.print("Your intput is ");
       for(int i=0;i<array.length;i++) {
        System.out.print("["+array[i]+"]");
       }
       System.out.println();

       EvenOddBit(array);
    }
}