import java.util.*;
import java.util.LinkedList;

public class QuestionThree {

    public static void printFirtNon(String st) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i=0;i<st.length();i++) {
            char ch = st.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a'] > 1) {
                q.remove();
            }

            if(q.isEmpty()) {
                System.out.print(-1+" ");
            }else {
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String st = "aabccxb";
        printFirtNon(st);
    }
}
