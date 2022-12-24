public class ClearijBits {
    public static int clearBitsAtijRange(int number,int i,int j) {
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bitmask = a | b;
        return number & bitmask;
    }
    public static void main(String[] args) {
        clearBitsAtijRange(10,2,4);
        System.out.println(clearBitsAtijRange(10,2,4));
    }
}
