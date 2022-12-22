import java.util.ArrayList;

public class MaxNum {
    public static void main(String[] args) {
    ArrayList<Integer> lys = new ArrayList<>();
    lys.add(1);
    lys.add(2);
    lys.add(3);
    lys.add(4);
    lys.add(5);
    int Max = Integer.MIN_VALUE;
    for(int i=0;i<lys.size();i++) {
        if(Max < lys.get(i)) {
            Max = lys.get(i);
        }
    }
    System.out.println(Max);
    }
}
