public class SetithBit {
    public static int ithBit(int num ,int i) {
        int bitmask = 1<<i;
        return num | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(ithBit(10,2 ));
    }
}
