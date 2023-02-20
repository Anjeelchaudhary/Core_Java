import java.util.Stack;

public class ReverseString {
    public static String isReverse(String str) {
        Stack<Character> s = new Stack<>();
        int indx = 0;
        while(indx < str.length()) {
            s.push(str.charAt(indx));
            indx++;
        }

        StringBuffer sb = new StringBuffer();
        while(!s.isEmpty()) {
            char res = s.pop();
            sb.append(res);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String quest = "abc";
        String outp = isReverse(quest);
        System.out.println(outp);
    }
}
