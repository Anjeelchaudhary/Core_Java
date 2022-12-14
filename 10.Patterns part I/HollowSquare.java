package starsFormat;

public class HollowSquare {
    public static void main(String[] args){
        int i,j;
        int n=5;
        int m=4;
        for(i=0;i<=n;i++){
            for(j=0;j<=m;j++){
                if( i==0 || i==n || j==0 || j==m){
                    System.out.print("*");
                }else{System.out.print(" ");}
            }
            System.out.println();
        }
    }
}
