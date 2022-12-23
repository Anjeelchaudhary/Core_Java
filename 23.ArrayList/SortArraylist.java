import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(5);
        lis.add(9);
        lis.add(2);
        lis.add(4);
        lis.add(1);
        lis.add(3);
        System.out.println(lis);
        Collections.sort(lis);//this line sorts for assending order
        System.out.println(lis);

        Collections.sort(lis, Collections.reverse(lis));//this line sorts in decending order
                        //comparators - function logic
        System.out.println(lis);
    }
}
