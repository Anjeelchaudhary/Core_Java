import java.util.Stack;

public class ReverseString {
    public static String isReverse(String str) {
        //first case where given string is pushed into stack
        Stack<Character> s = new Stack<>();
        int indx = 0;
        while(indx < str.length()) {
            s.push(str.charAt(indx));
            indx++;
        }
        //poped data from stack is stored by appending in StringBuffer
        StringBuffer sb = new StringBuffer();
        while(!s.isEmpty()) {
            char res = s.pop();
            sb.append(res);
        }
        return sb.toString();  //sb is in char form so toString() method is used to convert it into string form
    }
    public static void main(String[] args) {
        String quest = "abc";
        String outp = isReverse(quest);
        System.out.println(outp);
    }
}
