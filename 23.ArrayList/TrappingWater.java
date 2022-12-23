import java.util.ArrayList;

public class TrappingWater {
    public static int Trapped(ArrayList<Integer> height) {
        int maxWater = 0;
        for(int i=0;i<height.size();i++) {
            for(int j=i+1;j<height.size();j++) {
                int hgt = Math.min(height.get(i), height.get(j));
                int wdt = j-i;
                int currentWater = hgt * wdt;
                maxWater = Math.max(maxWater, currentWater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        //186254837
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(Trapped(height));
    }
}
