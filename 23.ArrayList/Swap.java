import java.util.ArrayList;

public class Swap {
    public static void Swwap(ArrayList<Integer> lys,int num1,int num2) {
        int temp = lys.get(num1);
        lys.set(num1, lys.get(num2));
        lys.set(num2, temp);
    }
    public static void main(String[] args) {
    ArrayList<Integer> lys = new ArrayList<>();
    lys.add(1);
    lys.add(2);
    lys.add(3);
    lys.add(4);
    lys.add(5);
    int num1 = 1;
    int num2 = 3;
    System.out.println(lys);
    Swwap(lys,num1,num2);
    System.out.println(lys);
    }
}
