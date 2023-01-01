class FriendPair {
    public static int friendpar(int n) {
        if(n == 1 || n ==2) {
            return n;
        }
        int fnm1 = friendpar(n-1);
        int pariways = (n-1) * (n-2);

        int totalPair = (n-1) + pariways;
        return totalPair;
    }
    public static void main(String[] args) {
        System.out.println(friendpar(3));
    }
}