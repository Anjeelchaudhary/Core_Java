public class PracticePlacingQueen {

    public static boolean isTrue(char board[][], int row ,int col) {

        //forVertical
        for(int i=row-1;i>=0;i--) {
           if( board[i][col] == 'Q') {
            return false;
           }
        }

        //forLeftDiagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
            if(board[i][j] == 'Q') {
            return false;
            }
        }

        //forRightDiagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nsQueens(char board[][] , int row) {
        //base case
        if(row == board.length) {
            print(board);
            return;
        }

        for(int j = 0; j < board.length ;j++) {
            if(isTrue(board,row,j)) {
                board[row][j] = 'Q';
                nsQueens(board, row+1);
                board[row][j] = '-';
            }
        }
    }

    public static void print(char board[][]) {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXX");
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 8;
        char board[][] = new char[n][n];

        //initialization part in nQueens
        for(int i = 0 ;i < n ; i++) {
            for(int j = 0; j < n ;j++) {
                board[i][j] = '-';
            }
        }
        nsQueens(board , 0);
    }
}
