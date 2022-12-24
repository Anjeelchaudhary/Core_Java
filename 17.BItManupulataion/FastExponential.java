public class FastExponential {
    public static int FastExp(int pow,int number) {
        int ans = 1;
        while(number>0) {
            if((number&1)!=0) {
                ans = ans*pow;
            }
            pow = pow * pow;
            number= number>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(FastExp(5,2));
    }
}
