public class clearBit {
    public static int clearithBit(int number ,int i ) {
        int bitmask = ~(1<<i);
        return bitmask & number;
    }
    public static void main(String[] args) {
        System.out.println(clearithBit(10, 1));
    }
}
