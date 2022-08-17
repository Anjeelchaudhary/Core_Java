package String;

import java.util.Scanner;

public class ConCat {
    public static void printFullName(String x , String y){
        System.out.println(x+ " "+y);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name : ");
        String lastName = sc.nextLine();
        printFullName(firstName, lastName);
        sc.close();
     }
}
