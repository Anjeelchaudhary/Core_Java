public class BitPractice {
    public static void EveOdd(int number) {
        int bitmas = 1;
        if((number & bitmas) == 0) {
            System.out.println("even number");
        }else {
            System.out.println("Odd number ");
        }
    }
    public static void main(String[] args) {
        EveOdd(2);
        EveOdd(14);
        EveOdd(5);
        EveOdd(7);
    }
}
