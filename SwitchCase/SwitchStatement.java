import java.util.Scanner;

public class SwitchStatement {

    public static void chooseONe(int no){
         switch(no){
            case 1 : System.out.println("Hello");
            break;

            case 2 : System.out.println("Namaste");
            break;

            case 3 : System.out.println("Hola");
            break;

            default : System.out.println("Invalid choice");
         }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number ");
        int num = in.nextInt();
        chooseONe(num);
        in.close();
    }
}
