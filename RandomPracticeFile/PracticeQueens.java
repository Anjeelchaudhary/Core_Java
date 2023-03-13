public class PracticeQueens {

    public static void queenS(char board[][], int row) {
        
        if(row == board.length) {
            printQueen(board);
            return;
        }

        for(int j = 0; j < board.length ;j++) {
            board[row][j] = 'Q';    //placed int board
            queenS(board, row+1);   //recursive call
            board[row][j] = '-';    //When it returns using bracktrack it will clear occupied place by Queen
        }
    }

    public static void printQueen(char board[][]) {
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];

        //initialization
        for(int i = 0 ;i < n ;i++) {
            for(int j = 0 ;j < n ;j++) {
                board[i][j] = '-';
            }
        }

        queenS(board , 0);
    }
}
