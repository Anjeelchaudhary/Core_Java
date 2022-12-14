package starsFormat;

public class Butterfly {
    public static void main(String args[]){
        int n = 4;

        //upper part
        for(int i=1;i<=n;i++){
            //left side part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int space = 2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //right side part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for(int i=n;i>=1;i--){
            //left side part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int space = 2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //right side part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
