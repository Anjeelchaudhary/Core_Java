package Recursion;

public class Recurr3 {
    public static void CalcRecursion(int n){
        if (n==10) {
            return;    
        }
        System.out.println(n);
        CalcRecursion(n+1);
    }
    public static void main(String[] args) {
        int number = 1;
        CalcRecursion(number);

    }
}
