package Arrays.OneDArray;

import java.util.Scanner;

public class Traverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Here we are taking the size of the array 
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int numbres[] = new int[size];

        //This is for the inputs in a array 
        for(int i=0;i<size;i++){
            System.out.print("Enter the number : ");
            numbres[i] = sc.nextInt();
        }

        System.out.print("Enter the number you want to search : ");
        int x = sc.nextInt();

        //Here we are checking the condition
        for(int i=0;i<numbres.length;i++)//here (numbers.length = size) because in array 
                if(numbres[i]==x){              //there is rule (nameOfArrau.length=privious given size of array)
                    System.out.println("Your desired number is : "+numbres[i]);
                }                     

        sc.close();
    }
}
