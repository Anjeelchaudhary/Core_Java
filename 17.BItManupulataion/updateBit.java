public class updateBit {
    public static int clearBit(int number ,int i) {
        int bitmask = ~(1 << i);
        return number & bitmask;
    }
    public static int upDate(int number ,int i, int newBit) {
        int clear = clearBit(number, i);
        int bittu = newBit<<i;
        return number | newBit;
    }
    public static void main(String[] args) {
        System.out.println(upDate(10,2,1));
    }
}
