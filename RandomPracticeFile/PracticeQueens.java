public class PracticeQueens {

    public static void queenS(char board[][], int row) {

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
