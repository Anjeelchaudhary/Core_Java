public class NatualSum {
    public static int sum(int num) {
        if(num == 1) {
            return 1;
        }
        int susum = num + sum(num-1);
        return susum;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
