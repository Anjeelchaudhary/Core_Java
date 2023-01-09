import java.util.ArrayList;

public class PracticeSwap {
    public static void ssWWp(ArrayList<Integer> list,int indx1, int indx2) {
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(5);
        list.add(6);
        int indx1 = 1;
        int indx2 = 2;
        System.out.println(list);
        ssWWp(list, indx1, indx2);
        System.out.println(list);
    }
}
