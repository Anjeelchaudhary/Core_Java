public class TilingProblem {
    public static int calcTile(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        //for Horizontal ways
        int firstWay = calcTile(n-1);

        //for vetical ways
        int secondWay = calcTile(n-2);
        int total = firstWay + secondWay ;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(calcTile(2));
    }
}
