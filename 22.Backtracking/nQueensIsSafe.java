public class nQueensIsSafe { 
    public static boolean isSafe(char board[][],int row,int col) {
        //vertical 
        for(int i=row-1;i>=0;i--) {
            board[i][col] = 'Q';
            return false;
        }
        //leftDiago
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--) {
            board[i][j] = 'Q';
            return false;
        }
        //rightDiago
        for(int i=row-1,j=col+1;i>=0 && j<=board.length;i--,j++) {
            board[i][j] = 'Q';
            return false;
        }
        return true;
    }
    public static void nQeen(char board[][],int row) {
        //base case 
        if(row == board.length) {
            print(board);
            return;
        }
        //workdone
        for(int j=0; j<board.length; j++) {
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                nQeen(board,row+1);//function call
                board[row][j] = 'X';//backtrack
            }
        }
    }
    //for printing of borads
    public static void print(char borad[][]) {
        for(int i=0; i<borad.length ; i++) {
            for(int j=0; j<borad.length ; j++) {
                System.out.print(borad[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                board[i][j] = 'X';
            }
        }
        nQeen(board,0);
    }
}
