package Arrays.OneDArray;

public class TrappedWater {
    public static int calcReserdWater(int height[]){
        
        //calculating leftMaxHeight
        int leftMaxheight[] = new int[height.length];
        leftMaxheight[0] = height[0];
        for(int i=1 ;i<height.length ;i++){       //here for i = 0 is already calculated ,So 1 is taken
            leftMaxheight[i] = Math.max(height[i], leftMaxheight[i-1]);    //here comparison between 1st and 2nd
        }

        //calculating rightMaxHeight
        int rightMaxheight[] =new int[height.length];
        rightMaxheight[height.length-1] = height[height.length-1];
        for(int i=height.length-2 ;i>=0 ;i--){     //here for height.length-1 is already calculated ,So -2 is taken
            rightMaxheight[i] = Math.max(height[i], rightMaxheight[i+1]);   //here comparison between last and 2nd last
        }

        int trappedWater = 0;
        //Loop
        for(int i=0;i<height.length;i++){
            //WaterLevel = min(LeftMaxBoundary,rightMaxBounday)
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
