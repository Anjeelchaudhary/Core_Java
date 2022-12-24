public class PowerOfNum {
    public static boolean isPowerTwo(int Number) {
        return (Number&(Number-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerTwo(4));
    }
}
