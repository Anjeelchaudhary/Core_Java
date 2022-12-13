import java.util.Scanner;

public class Circumfcircle {
    public static void calculateCircumference(int x){
        double calc = 2*3.141*x;
        System.out.println("The circumference of the circle is : "+calc);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");;
        int radius = sc.nextInt();
        calculateCircumference(radius);
        sc.close();
    }
}
