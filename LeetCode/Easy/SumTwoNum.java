package Easy;

public class SumTwoNum {
    public static void sumTwo(int data[],int target) {
        for(int i=0;i<data.length-1;i++) {
            for(int j=0;j<data.length;j++) {
                if((data[i] + data[j]) == target) {
                    System.out.println("["+data[i]+","+data[j]+"]");
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int key = 9;
        sumTwo(nums,key);
    }   
}
