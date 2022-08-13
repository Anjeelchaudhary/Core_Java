import java.util.Scanner;

//Write a function to print the sum of all odd numbers from 1 to n.

class Sumoddnum{

    //function declaration 
    public static void calculateOddNum(int x){
        int sum = 0;
        for(int i=0;i<=x;i++){
            if(i%2!=0 ){
                sum = sum+i;
            }
        }
        System.out.print("The sum of all odd numbers upto "+x+" are "+sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to input : ");
        int input = sc.nextInt();
        calculateOddNum(input);
        sc.close();
    }
}