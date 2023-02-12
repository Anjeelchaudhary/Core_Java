
public class bottomPira {
    public static void main(String args[]){
        int n = 4;

        //outer loop
        for(int i=0;i<=n;i++){

            //innerloop-> space print
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            //innerloop -> star print
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
