import java.util.ArrayList;

public class TwoDArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        mainlist.add(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        mainlist.add(list2);

        for(int i=0 ; i<mainlist.size() ;i++) {
            ArrayList<Integer> currenList = mainlist.get(i); // values gets copied to currentlist from mainlist
            for(int j=0;j<currenList.size();j++) {
                System.out.print(currenList.get(j)+" ");
            }
            System.out.println();
        }
        
    }
}
