import java.util.Scanner;

class SimpleHandle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value in a : ");
        int a = sc.nextInt();
        System.out.print("Enter first value in b : ");
        int b = sc.nextInt();

        //Exception is handeled through try and catch method
        try {
            int div = a/b;
            System.out.println("Your division is : "+div);
        }catch(ArithmeticException e) {
            System.out.println(e);
        }
    }

    //Exception is handeled through throws method
    // public static void main(String[] args) throws Exception {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter first value in a : ");
    //     int a = sc.nextInt();
    //     System.out.print("Enter first value in b : ");
    //     int b = sc.nextInt();
    //     int div = a/b;
    //     System.out.println("Your output is : "+div);
    // }

    
}