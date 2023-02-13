

public class Recurr5 {
    public static void printFact(int i,int n,int fact){
        if(n == i){
            fact = fact * n;
            System.out.println(fact);
            return;
        }
        fact = fact * n;
        printFact(i, n-1, fact);
    }
    public static void main(String[] args) {
        printFact(1, 3,1);
    }
}
