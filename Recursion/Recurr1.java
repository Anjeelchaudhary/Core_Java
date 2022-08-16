package Recursion;

public class Recurr1 {

    public static void Recurrrsion(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        Recurrrsion(n-1);
    }
    public static void main(String[] args) {
        int number = 5;
       Recurrrsion(number);
    }
}
