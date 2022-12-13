import java.util.Scanner;

//Enter 3 numbers from the user & make a function to print their average.

public class Printavg{

    //function
    public static void calculateAvg(int a,int b,int c){
        if(a>b){
            if(b>c){
                System.out.println("The average number is : " +b);
            }else{
                System.out.println("The average number is : " +c);
            }
        }else if(c>a){
            if(a>b){
                System.out.println("The average number is : " +a);
            }else{
                System.out.println("The average number is : " +b);
            }
        }else if(b>c){
            if(c>a){
                System.out.println("The average number is : " +c);
            }else{
                System.out.println("The average number is : " +a);
            }
        }else{
            System.out.println("All numbers are equal or may be invalid input");
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x = sc.nextInt();
        System.out.print("Enter the second number : ");
        int y = sc.nextInt();
        System.out.print("Enter the third number : ");
        int z = sc.nextInt();
        calculateAvg(x, y, z);
        sc.close();
    }
}