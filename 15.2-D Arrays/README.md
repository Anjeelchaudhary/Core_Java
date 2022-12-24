## 15.2-D Arrays
Code for 
[Digonal sum](https://github.com/Anjeelchaudhary/JavaCode/blob/master/15.2-D%20Arrays/DigonalSum.java)

#### # Digonal sum

```
     public static int CalcDiSum(int matrix[][]) {
        int sum = 0;

        for(int i=0;i<matrix.length;i++) {
            sum += matrix[i][i];

            if(i != matrix.length-1) {
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
```
#
Code for 
[Spiral matrix](https://github.com/Anjeelchaudhary/JavaCode/blob/master/15.2-D%20Arrays/SpiralMatrix.java)

#### # Spiral matrix
```
 public static void Spiral(int matrix[][]){
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = matrix.length-1;
        int EndCol = matrix[0].length-1;

        while(StartRow<=EndRow && StartCol<=EndCol ) {
            //for top
            for(int j=StartCol;j<=EndCol;j++) {
                System.out.print(matrix[StartRow][j]+" ");
            }
            //for right
            for(int i=StartRow+1;i<=EndRow;i++) {
                System.out.print(matrix[i][EndCol]+" ");
            }
            //for bottom
            for(int j=EndCol-1;j>=StartCol;j--) {
                if(StartCol == EndCol) {
                    break;
                }
                System.out.print(matrix[EndRow][j]+" ");
            }
            //for left
            for(int i=EndRow-1;i>=StartRow+1;i--) {
                if(StartRow == EndRow) {
                    break;
                }
                System.out.print(matrix[i][StartCol]+" ");
            }
            StartCol++;
            StartRow++;
            EndCol--;
            EndRow--;
        }
        System.out.println();
    }
```
#
Code for 
[Stair Case](https://github.com/Anjeelchaudhary/JavaCode/blob/master/15.2-D%20Arrays/StairCase.java()

#### # Stair Case

```
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
```