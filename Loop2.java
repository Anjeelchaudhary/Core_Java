import java.util.*;

class Loop2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of Sequence in t :");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            System.out.print("Enter the value of a :");
            int a = in.nextInt();
            System.out.print("Enter the value of b :");
            int b = in.nextInt();
            System.out.print("Enter the value of n :");
            int n = in.nextInt();
        for(int j=0;j<n;j++){
            a = a + (int)Math.pow(2,j) * b;
            System.out.print(a+" ");
        }
        System.out.println();
        }
        in.close();
    }
}