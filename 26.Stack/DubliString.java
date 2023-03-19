import java.util.*;;

public class DubliString {

    public static boolean isValid(String str1) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str1.length();i++) {
            char ch = str1.charAt(i);

            //for closing
            //if the ch = ) has this , than finding pair i.e ( 
            //until and unless it doesn't finds it matching paranthesis is pops ans increase count by 1
            if(ch == ')') {
                int count = 0;
                while(st.pop() != '(') {
                    count++;
                }

                //if the count is less than 1 then there is presence of dublicate
                if(count < 1) {
                    return true;
                }
            }else {

                //for opening
                //means that ch value is not ( so it will push in the stack
                st.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "((a+b))";
        System.out.println(isValid(str1));

    }
}
