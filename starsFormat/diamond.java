package starsFormat;
public class diamond {
    public static void main(String[] args){

        //outer loop
        for(int i=1;i<=6;i++){

            //spcae->print
            for(int j=1;j<=6-i;j++){
                System.out.print(" ");
            }

            //star print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
           

            //star ->print
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        } 
        //lower part
        for(int i=5;i>=1;i--){

            //spcae->print
            for(int j=1;j<=6-i;j++){
                System.out.print(" ");
            }

            //star print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
           

            //star ->print
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }  
    }

}
