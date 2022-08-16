package Iteration;

import java.util.Scanner;

public class SumNo {
    public static void main(String[] args){
        int init = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want : ");
        int numbers = sc.nextInt();
        for(int i=0;i<=numbers;i++){
            System.out.print(init+" + ");
            init++;
        }
        sc.close();
    }
}
