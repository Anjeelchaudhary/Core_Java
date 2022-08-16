package Recursion;

import java.util.Scanner;

public class SumNatualn {
    public static void CalcSumUptoNum(int x,int y){
        if(x == y){
           return;
        }
        System.out.print(x+" + ");
        CalcSumUptoNum(x+1, y);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your natural number : ");
        int startnum = sc.nextInt();
        System.out.print("Enter your ending of natural number : ");
        int endnum = sc.nextInt();
        CalcSumUptoNum(startnum,endnum);
        sc.close();
    }
}
