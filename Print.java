import java.util.*;

public class Print{

    public static void draw(int a)
    {
         int i,j;
         for(i=0;i<a;i++){
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
         }
   }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your desired number for building star = ");
        int y =sc.nextInt();
        int x = y;
        draw(x);
        sc.close();
    }
}