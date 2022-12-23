import java.util.ArrayList;

public class ThreeDArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        
        //inserting integer in all lists in single loop
        for(int i=0;i<=5;i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        //not adding all list to mainList 
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        //Now printing 
        for(int i=0;i<mainList.size();i++) {
            ArrayList<Integer> currentList = mainList.get(i);
            for(int j=0;j<currentList.size();j++) {
                System.out.print(currentList.get(j)+" ");
            }
            System.out.println();
        }



    }
}
