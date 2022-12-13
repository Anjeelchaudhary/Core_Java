package Recursion;

public class Recurr2 {
    public static void calcNubmer(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        calcNubmer(n-1);
    }

    public static void main(String[] args) {
        int number = 5;
        calcNubmer(number);
        
    }
}
