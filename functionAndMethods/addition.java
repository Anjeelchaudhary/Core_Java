package functionAndMethods;

import java.util.Scanner;

public class addition {

    //declaring a function 
    public static int sumOfTwoNum(int a,int b){
        int sum = a+b;
        System.out.print("The sum of two number is :"+sum);
        return sum;
    }
    //main function
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x =sc.nextInt();
        System.out.print("Enter the second number : ");
        int y =sc.nextInt();
        sumOfTwoNum(x, y);
        sc.close();
    }
}
