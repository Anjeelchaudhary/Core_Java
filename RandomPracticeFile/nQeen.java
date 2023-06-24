public class NQeen {

    public static boolean isTrue(char array[][], int row , int col) {
        //vertical 
        for(int i= row-1;i>=0;i--) {
            if(array[i][col] == 'Q') {
                return false;
            }
        }

        //leftdiagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
            if(array[i][j] == 'Q') {
                return false;
            }
        }

        for(int i=row-1,j=col+1;i>=0 && j<array.length ;i--,j++) {
            if(array[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQeenBebbo(char array[][],int row) {
        if(row == array.length) {
            printQeen(array);
            return;
        }

        for(int j=0;j<array.length;j++) {
            if(isTrue(array,row,j)) {
                array[row][j] = 'Q';
                nQeenBebbo(array, row+1);
                array[row][j] = '-';
            }
        }
    }

    public static void printQeen(char array[][]) {
        System.out.println("XXXXXXXXXX");

        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array.length;j++) {
                System.out.print(array[i][j]+" ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char array[][] = new char[n][n];

        //for initializing
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                array[i][j] = '-';
            }
        }

        nQeenBebbo(array,0);
    }
}
