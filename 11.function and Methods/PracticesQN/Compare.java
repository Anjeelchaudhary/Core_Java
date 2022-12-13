import java.util.Scanner;

//Write a function which takes in 2 numbers and returns the greater of those two.

public class Compare {
    public static void CompareTwoNum(int a , int b) {
        if(a>b){
            System.out.println("The first number is greate ie : "+a);
        }else{
            System.out.println("The second number is greate ie : "+b);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x = sc.nextInt();
        System.out.print("Enter the second number : ");
        int y = sc.nextInt();
        CompareTwoNum(x , y);
        sc.close();
    }
}
