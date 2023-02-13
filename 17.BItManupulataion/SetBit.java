

public class SetBit {
    public static void main(String[] args) {
        int number = 5;
    int position = 1;
    int bitmas = 1 << position;

    int bitBoy = bitmas | number;
    System.out.println(bitBoy);
    }
}
