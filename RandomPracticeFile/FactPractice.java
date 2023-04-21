public class FactPractice {
    public static int reOccur(int array[] ,int i,int key) {
        if(i == array.length) {
            return -1;
        }
        if(array[i] == key) {
            return i;
        }
        return reOccur(array, i+1, key);
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,5,6,7,8,9,10};
        System.out.println(reOccur(array, 0, 5));
    }
}
