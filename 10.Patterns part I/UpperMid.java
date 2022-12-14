package starsFormat;
public class UpperMid {
 public static void main(String[] args) {
        int n = 4;

        //outer loop
        for(int i=n;i>=0;i--){
            //Inner loop
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
