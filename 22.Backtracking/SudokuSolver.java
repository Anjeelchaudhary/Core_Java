public class SudokuSolver {
    public static boolean isSafe(int sudoku[][],int row,int col,int digit) {
        //for row
        for(int i=0;i<=8;i++) {
            if(sudoku[i][col] == digit) {
                return false;
            }
        }
        //for columne
        for(int j=0;j<=8;j++) {
            if(sudoku[row][j]==digit) {
                return false;
            }
        }

        //for grid     //here to find the perticular grid we use for StartingRow = (row/3)*3 & for StartingColumne = (columne/3)*3
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        //traversing in 3x3 small matrix
        for(int i=sr;i<sr+3;i++) {
            for(int j=sc;j<sc+3;j++) {
                if(sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;

    }
    public static boolean sudoSolver(int sudoku[][],int row,int col) {
        //base case
        if(row == 9) {
            return true;
        }

        //Recursion
        //this is the condition check for going next row
        //if columne has filled all the 9 columns then it chages for next row
        int nextRow = row , nextCol = col+1;
        if(col+1==9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        //if there already exit a number in a cell than jump into next step
        if(sudoku[row][col] !=0 ) {
            return sudoSolver(sudoku,nextRow,nextCol);
        }
        
        //placing a number in every cell
        for(int digit=1;digit<=9;digit++) {
            if(isSafe(sudoku,row,col,digit)) {  //<<--checking if that number is right for that cell or not 
                sudoku[row][col]=digit;         //digit assignig to the cell
                if(sudoSolver(sudoku,nextRow,nextCol)) {   //<<--sollutin exist
                    return true;
                } 
                sudoku[row][col] = 0;  //<<--no sollution exist
            }
        }
        return false;
    } 
    public static void printSudoku(int sudoku[][]) {
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][] = {{0,8,0,0,0,0,2,0,0},
        {0,0,0,0,8,4,0,9,0},
        {0,0,6,3,2,0,0,1,0},
        {0,9,7,0,0,0,0,8,0},
        {8,0,0,9,0,3,0,0,2},
        {0,1,0,0,0,0,9,5,0},
        {0,7,0,0,4,5,8,0,0},
        {0,3,0,7,1,0,0,0,0},
        {0,0,8,0,0,0,0,4,0}};
        if(sudoSolver(sudoku, 0, 0)) {
            System.out.print("Sollution exist ");
            printSudoku(sudoku);
        }else {
            System.out.println("Sollution does not exist ");
        }
    }
}
