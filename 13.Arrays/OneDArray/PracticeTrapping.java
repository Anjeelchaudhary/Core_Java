package Arrays.OneDArray;

public class PracticeTrapping {
    public static int calcTrapped(int height[]){
        int LeftMH[] = new int[height.length];
        LeftMH[0] = height[0];
        for(int i=1;i<height.length-1;i++){
            LeftMH[i] = Math.max(LeftMH[i], height[i-1]);
        }

        int RightMH[] = new int[height.length];
        RightMH[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            RightMH[i] = Math.max(RightMH[i], height[i+1]);
        }
        int tappedWattahh = 0;
        for(int i=0;i<height.length;i++){
            int wattahLevel = Math.min(RightMH[i], LeftMH[i]);
            tappedWattahh += wattahLevel - height[i];
        }
        return tappedWattahh ;
        
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println((calcTrapped(height)));
    }
}