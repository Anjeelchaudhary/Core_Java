public class LargestString {
    public static void main(String[] args) {
        String froots[] = {"apple","mango","banana"};
        
        String Largest = froots[0];
        for(int i=0;i<froots.length;i++) {
            if(Largest.compareTo(froots[i]) < 0) {
                Largest = froots[i];
            }
        }
        System.out.println(Largest);
    }
}
