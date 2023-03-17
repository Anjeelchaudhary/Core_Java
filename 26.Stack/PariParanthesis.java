import java.util.*;;

public class PariParanthesis {

    public static boolean isValid(String st) {
        Stack<Character> s = new Stack();       //created a stack 

                //this is for opening brackets 
        for(int i=0;i<st.length();i++) {
            char c = st.charAt(i);              //storing single single element on c from string
            if(c == '(' || c == '{' || c == '[') {
                s.push(c);                      //if above condition matches then pushes to stack 

                //this is for closing brackests
            }else {

                //if opening three cases fails then firstly it checks if it is empty or not 
                if(s.isEmpty()) {
                    return false;
                } 
                
                //if it finds pair of parenthesis then pops out otherwise there is some fault in string vlues
                if((s.peek() == '(' && c == ')') || (s.peek() == '{' && c == '}') || (s.peek() == '[' && c == ']') ) {
                    s.pop();
                }else {
                    //this means it violets the rule of pair
                    return false;
                }
            }                      
        }

        if(s.isEmpty()) {
            return true;
        }else {
            return false;   //this is for checking if there is left any only opening brackets
        }
    }
    public static void main(String[] args) {
        String st = "({})[]";
        System.out.println(isValid(st));
    }
}
