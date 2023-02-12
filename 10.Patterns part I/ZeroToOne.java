public class ZeroToOne {
    public static void main(String args[]){
        int n = 5;
        int i,j;

        //outer loop 
        for( i=1;i<=n;i++){
            //inner loop
            for(j=1;j<=i;j++){
                int sum = i+j;
                if(sum % 2 ==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
