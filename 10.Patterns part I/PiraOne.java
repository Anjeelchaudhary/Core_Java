public class PiraOne {
 public static void main(String[] args) {
        int n = 4;

        //outerLoop
        for(int i=0;i<=n;i++){
            //InerLoop
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
