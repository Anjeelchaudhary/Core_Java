
public class OPtimisedBinary {
    public static void binaryStrign(int n,int lastPlace ,StringBuilder str) {
        //base case
        if(n ==0){
            System.out.println(str);
            return;
        }

        //append
        binaryStrign(n-1, 0, str.append("0"));
        if(lastPlace == 0) {
            binaryStrign(n-1, 1, str.append("1"));
        }
    }
    public static void main(String[] args) {
        binaryStrign(3,0,new StringBuilder());
    }
}
