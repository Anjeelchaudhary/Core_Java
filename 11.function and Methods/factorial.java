
import java.util.Scanner;

public class factorial {

    public static void  calcFactorial(int x){
        int fact = 1;
        for(int i=1;i<=x;i++){
           fact = fact - i;
        }
        System.out.print("factorial is : "+ fact);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number : ");
        int a =sc.nextInt();
        calcFactorial(a);
        sc.close();
    }
}
