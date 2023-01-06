public class Nqueens {
    //This code is only for how to placing nQueens in the chess borad
    public static void nQeen(char board[][],int row) {
        //base case 
        if(row == board.length) {
            print(board);
            return;
        }
        //workdone
        for(int j=0; j<board.length; j++) {
            board[row][j] = 'Q';
            nQeen(board,row+1);//function call
            board[row][j] = 'X';//backtrack
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
        int n = 2;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                board[i][j] = 'X';
            }
        }
        nQeen(board,0);
    }
}
