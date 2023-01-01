

public class TowerOfHanoi {
    public static void TowerOfHanoii(int n ,String source, String helper , String dest){
        if(n == 1){
        System.out.println("Transfering disk "+n+"from "+source+" to"+dest);
        return;

        }
        TowerOfHanoii(n-1, source, dest, helper);
        System.out.println("Transfering disk "+n+" from "+source+" to "+dest);
        TowerOfHanoii(n-1, helper, source, dest);
    }
    public static void main(String[] args) {
        int n = 1;
        TowerOfHanoii(1, "S", "H", "D");
    }
}
