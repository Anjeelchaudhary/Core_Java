

import java.util.Scanner;

public class multiplication {

    public static int calculateMultiplication(int a , int b){
        int mul = a* b;
        return mul;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x =sc.nextInt();
        System.out.print("Enter the second number : ");
        int y =sc.nextInt();
        int multi = calculateMultiplication(x, y);
        System.out.println("The multiplication of two number is : "+multi);
        sc.close();
    }
}
