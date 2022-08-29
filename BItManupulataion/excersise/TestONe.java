package BItManupulataion.excersise;

import java.util.Scanner;

public class TestONe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.print("Enter the position: ");
        int position = sc.nextInt();

        int bitMask = 1 << position;

        if((bitMask & number) == 0){
            System.out.println("Zero");
        }else{
            System.out.println("One");
        }

        sc.close();

    }
}
