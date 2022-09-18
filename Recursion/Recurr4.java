package Recursion;

public class Recurr4 {
    public static void printRecurr(int i,int n,int sum){
        if(i==n){
            sum = sum+i;//here sum+=i; is same as sum=sum+i
            System.out.println(sum);
            return;
        }
        sum =sum+i;
        printRecurr(i+1, n, sum);
    }
    public static void main(String[] args) {
        printRecurr(1, 5,0);
        
    }
}
