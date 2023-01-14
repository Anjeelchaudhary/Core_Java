import java.util.ArrayList;

public class PairSumRotaion {
    public static boolean calcRotaionalPairSum(ArrayList<Integer> lys,int target) {
        int Bp = -1;
        int n =lys.size();
        for(int i=0;i<lys.size();i++) {
            if(lys.get(i) > lys.get(i+1)) {
                Bp = i;
                break;
            }
        }
        int Lp = Bp+1;
        int Rp = Bp;
        while(Rp != Lp) {
            if(lys.get(Lp)+lys.get(Rp)==target) {
                return true;
            }
            if(lys.get(Lp)+lys.get(Rp) < target) {
                Lp = (Lp+1) % n;
            }else{
                Rp = (n+Rp-1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> lys =new ArrayList<>();
        lys.add(11);
        lys.add(15);
        lys.add(6);
        lys.add(8);
        lys.add(9);
        lys.add(10);
        int target = 16;
        System.out.println(calcRotaionalPairSum(lys, target));

    }
}
