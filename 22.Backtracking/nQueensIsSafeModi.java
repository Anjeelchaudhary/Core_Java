public class nQueensIsSafeModi {
    public static boolean isSafe(char board[][],int row ,int col) {
        //vertical up
        for(int i=row-1;i>=0;i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        //left
        for(int i=row-1,j=col-1; i>=0 && j>=0 ; i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        //right
        for(int i=row-1,j=col+1; i>=0 && j>=board.length; i--,j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;


    }
    public static void nQueens(char board[][],int row) {
        //base
        if(row == board.length) {
            printQueen(board);
            return;
        }

        for(int j=0;j<board.length;j++) {
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                nQueens(board,row+1);
                board[row][j] = 'X';
            }
        }
    }
    public static void printQueen(char borad[][]) {
        System.out.println("---nQueens---");
        for(int i=0; i<borad.length ; i++) {
            for(int j=0; j<borad.length ; j++) {
                System.out.print(borad[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n= 4;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board,0);
    }
}
