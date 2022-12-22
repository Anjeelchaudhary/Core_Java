public class StairCase {
    public static boolean Stair(int matrix[][],int key) {
        int row = 0;
        int column = matrix[0].length-1;

        while(row <= matrix.length-1 && column >= 0) {

            if(matrix[row][column] == key ) {
                System.out.println("Your key is in cell : ("+row+","+column+")");
                return true;
            }
            else if(key < matrix[row][column]) {
                column--;
            }
            else  (key > matrix[row][column]) {
                row++;
            }
        }
        System.out.println("Your desired value is not in the matrix :(");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}}; 
        int key = 33;
        Stair(matrix, key);
    }
}
