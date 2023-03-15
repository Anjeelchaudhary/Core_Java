public class Queen {

    //This function returns false if there is presence of Queens in vertical or in diagonal line
    public static boolean isImTrue(char board[][] ,int row , int col) {

        //this checks in vetical line
        for(int i=row-1;i>=0;i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //this checks in rightDiagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        //this checks in leftDiagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueen(char board[][], int row) {
        //base case 
        //termination condition
        if(row == board.length) {
            print(board);
            return;
        }

        for(int j=0;j<board.length;j++) {
            //checking ifThere is already Q in eigther in vertical or diagonal line
            if(isImTrue(board,row,j)) {
                board[row][j] = 'Q';
                nQueen(board, row+1);
                board[row][j] = '-';
            }
        }
    }

    //This is for printing chessBoard
    public static void print(char board[][]) {
        System.out.println("XXXXXXXXXXXXX");      //This shows as border line 

        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();           //this is for new line
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];


        //initialization part
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                board[i][j] = '-';
            }
        }
        nQueen(board,0);
    }
}
