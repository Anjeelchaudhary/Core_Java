package String;

import java.util.Scanner;

public class ConCat {
    public static void printFullName(String x , String y){
        System.out.println(x+ " "+y);

        /*//here .length() <- this function gives the length the word
        System.out.println(x.length());
        */

        //charAt() <- this function is used to access all the letter in a word
        for(int i=0;i<x.length();i++){
            System.out.println(x.charAt(i));
        }
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
