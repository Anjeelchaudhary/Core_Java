package Arrays.TwoDArray;

import java.util.Scanner;

public class FindN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row of matix : ");
        int row = sc.nextInt();
        System.out.print("Enter the column of matix : ");
        int cols = sc.nextInt();

        int[][] arr = new int[row][cols];

        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the number you wanted to search : ");
        int x = sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==x){
                    System.out.println("Your number is present in "+i+" row and "+j+" colums");
                }
            }
        }



        sc.close();

    }
}
