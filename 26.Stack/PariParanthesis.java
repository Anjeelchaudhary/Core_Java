import java.util.*;;

public class PariParanthesis {

    public static boolean isValid(String st) {
        Stack<Character> s = new Stack();

        for(int i=0;i<st.length();i++) {
            char c = st.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                s.push(c);
                
            }
        }
    }
    public static void main(String[] args) {
        String st = "({})[]";
    }
}
