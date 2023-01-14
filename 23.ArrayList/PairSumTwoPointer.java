import java.util.ArrayList;

public class PairSumTwoPointer {
    public static boolean TwoPointerApproach(ArrayList<Integer> lys,int Target) {
        int Lp = 0;
        int Rp = lys.size()-1;
        while(Lp != Rp) {
            if(lys.get(Rp)+lys.get(Lp)==Target) {
                return true;
            }
            if(lys.get(Rp)+lys.get(Lp) < Target) {
                Lp ++;
            }else{
                Rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> lys =new ArrayList<>();
        lys.add(1);
        lys.add(2);
        lys.add(3);
        lys.add(4);
        lys.add(5);
        lys.add(6);
        System.out.println(TwoPointerApproach(lys,5));
    }
}
