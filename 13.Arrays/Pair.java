
public class Pair {
    public static void calcPair(int numbers[]) {
        for(int i=0;i<numbers.length;i++){
            int currentvalue = numbers[i];
                for(int j=i+1;j<numbers.length;j++){
                    int current = numbers[j];
                    System.out.print("("+currentvalue+","+current+")");
                    System.out.println();
                }
        }
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6};
        calcPair(numbers);
    }
}
