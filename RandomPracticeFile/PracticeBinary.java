public class PracticeBinary {
    public static void BInnladin(int line[],int key) {
        int start = 0,end = line.length-1;
        for(int i=start;i<=end;i++) {
            int mid = (start+end) /2;
            if(line[i] == key) {
                System.out.println("Your searched number found = "+line[i]);
            }else if (line[i] > key) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
    }
    public static void main(String[] args) {
        int line[] = {1,5,8,10,13,16,19,22,30,45};
        int key = 8;
        BInnladin(line,key);
    }
}
