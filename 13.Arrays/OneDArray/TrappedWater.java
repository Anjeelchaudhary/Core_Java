package Arrays.OneDArray;

public class TrappedWater {
    public static int calcReserdWater(int height[]){

        int leftMaxheight[] = new int[height.length];
        leftMaxheight[0] = height[0];
        for(int i=1 ;i<height.length ;i++){
            leftMaxheight[1] = Math.max(height[i], leftMaxheight[i-1]);
        }
        int rightMaxheight[] =new int[height.length];
        rightMaxheight[height.length-1] = height[height.length-1];
        for(int i=height.length-2 ;i>=0 ;i--){
            rightMaxheight[i] = Math.max(height[i], rightMaxheight[i+1]);
        }
        int trappedWater = 0;
        for(int i=0;i<height.length;i++){
            int waterLevel = Math.min(leftMaxheight[i], rightMaxheight[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;


    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(calcReserdWater(height));
    } 
}
