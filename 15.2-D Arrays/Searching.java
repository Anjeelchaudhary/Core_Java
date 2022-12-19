import java.util.Scanner;

public class Searching {

        public static boolean Search (int matrix[][], int key ) {
            for(int i=0;i<matrix.length;i++) {
                for(int j=0;j<matrix[0].length;j++) {
                    if(matrix[i][j] == key) {
                        System.out.println("Your searched number found in cell : ("+i+","+j+")");
                        return true ;
                    }     
                }
            }
            System.out.println("your serched number is not found in matrix ");
            return false;
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        //n = array.length
        //m = array[0].length
        
        //This function takes the input 
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //This function gives the output
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    Search(matrix,5);
  }
}
