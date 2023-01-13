import java.util.ArrayList;

public class PairSum {
    public static boolean calcPairSum(ArrayList<Integer> lys,int target) {
        for(int i=0;i<lys.size();i++) {
            for(int j=i+1;j<lys.size();j++) {
                if(lys.get(i)+lys.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> lys = new ArrayList<>();
        lys.add(1);
        lys.add(2);
        lys.add(3);
        lys.add(4);
        lys.add(5);
        lys.add(6);
        int target = 5;
        System.out.println(calcPairSum(lys,target));
    }
}
