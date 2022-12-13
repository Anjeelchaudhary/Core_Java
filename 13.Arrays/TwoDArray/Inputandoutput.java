package Arrays.TwoDArray;

import java.util.Scanner;

public class Inputandoutput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //code for asking the number of rows and columns 
        System.out.print("Enter the row value : ");
        int row = sc.nextInt();
        System.out.print("Enter the column value : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        //code for input in array 
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               arr[i][j]= sc.nextInt();
            }
        }
        //code for showing output which are taken by the user 
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               System.out.print(+arr[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
