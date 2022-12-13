package Recursion;

public class Recurr6 {
    public static void printFibb(int a, int b, int fib){
        if(fib == 0 ){
            return;
        }
        int sum = a + b;
        System.out.println(sum);
        printFibb(b, sum, fib-1);//here b is passed as a variable and first fib is passed as b variable and last fibb is as fibb
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int fib = 10;
        printFibb(a, b, fib-2);//here -2 is for the first two step i.e: a and b
    }
}
