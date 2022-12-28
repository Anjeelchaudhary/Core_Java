public class Power {
    public static int calcPow(int x ,int n) {
        if(n == 0) {
            return 1;
        }
        // int xnm1 = calcPow(x,n-1)
        // int fn = x * xnm1;
        // return fn;

        return x * calcPow(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(calcPow(5, 2));
    }
}
