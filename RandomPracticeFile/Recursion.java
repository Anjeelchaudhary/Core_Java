public class Recursion {
    //for factorial 
    public static int factorial(int number) {
        //base case
        if (number == 0) {
            return 1;
        } 
        //work done 
        int fact = number * factorial(number-1);
        return fact;
    }
    //for fibbonacy
    public static int fibbonacy(int number) {
        //base case
        if(number == 0 || number == 1) {
            return number;
        }
        int temp =  fibbonacy(number-1) + fibbonacy(number-2);
        return temp;
    }
    public static void main(String[] args) {
        System.out.println("factorial : "+factorial(5));
        System.out.println("fibbonacy : "+fibbonacy(5));
    }
}
