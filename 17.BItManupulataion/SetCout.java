public class SetCout {
    public static int CountSetBit(int number) {
        int count = 0;
        while(number>0) {
            if((number&1) != 0) {
                count++;
            }
            number = number>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(CountSetBit(15));
    }
}
