package SwitchCase;

import java.util.Scanner;

public class Calculator {
    public static void Calculator(int exp){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b = ");
        int b = sc.nextInt();
        sc.close();
        switch(exp){
           
            case 1 : {
                int sum = a + b ;
                System.out.println("The sum of two number is = "+sum);
                break;
            }
            case 2 : {
                int diff = a - b ;
                System.out.println("The difference of two number is = "+diff);
                break;
            }
            case 3 : {
                int mul = a * b ;
                System.out.println("The multiplication of two number is = "+mul);
                break;
            }
            case 4 : {
                int div = a / b ;
                System.out.println("The division of two number is = "+div);
                break;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for add, 2 for difference , 3 for multiplication , 4 for division of numbers= ");
        int c = sc.nextInt();
        Calculator(c);
        sc.close();
    }
}
