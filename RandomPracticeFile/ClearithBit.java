public class ClearithBit {
    public static int clearibit(int number, int i) {
        // ~0 or -1 denotes the same thing i.e 11111111....
        int bitmask = (~0)<<i;
        return number & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearibit(15,2));
    }
}
