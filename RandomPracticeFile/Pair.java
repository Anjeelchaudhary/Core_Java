public class Pair {
    public static void calcPairs(int arre[]){
        for(int i=0;i<arre.length;i++){
            int currentNUmber = arre[i];
            for(int j=i+1;j<arre.length;j++){
                System.out.print("("+currentNUmber+","+arre[j]+") ");
            }
        }
    }
    public static void main(String[] args) {
        int arre[] = {1,3,4,5,7,9,10,13};
        calcPairs(arre);
    } 
}
