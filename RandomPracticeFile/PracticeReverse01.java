package Arrays.OneDArray;

class PracticeReverse{
    public static void calcRev(int arru[]){
        int start = 0;
        int end = arru.length-1;

        while(start<end){
            int temp = arru[start];
            arru[start] = arru[end];
            arru[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arru[] = {1,3,4,6,8,15,21};
        calcRev(arru);
        
        for(int i=0;i<arru.length-1;i++){
            System.out.print(arru[i]);
        }
        System.out.println(" ");

    }
}