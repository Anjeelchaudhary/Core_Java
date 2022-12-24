public class getithBit {
    public static int getiBit(int number , int i) {
        int bitmask = 1 << i;
        if((number&bitmask) == 0) {
            return 0;
        }else {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getiBit(10, 3));
    }
}
