import java.util.ArrayList;

public class StoreWater {
    public static int calcStoreWater(ArrayList<Integer> lys) {
        int maxWater = 0;
        for(int i=0;i<lys.size();i++) {
            for(int j=i+1;j<lys.size();j++) {
                int height = Math.min(lys.get(i),lys.get(j));
                int width = j-i;
                int area = height * width;
                maxWater = Math.max(maxWater, area);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> lys =new ArrayList<>();
        lys.add(1);
        lys.add(8);
        lys.add(6);
        lys.add(2);
        lys.add(5);
        lys.add(4);
        lys.add(8);
        lys.add(3);
        lys.add(7);
        System.out.println(calcStoreWater(lys));
    }
}
