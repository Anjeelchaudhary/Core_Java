package Easy;

public class ValidPalindrome {
    public static boolean palind(String str) {
        if(str.isEmpty()) {
            return true;
        }

        for(int start = 0; start <=str.length();start++) {
            for(int end = str.length()-1; end >= 0; end--) {
                char firtst = str.charAt(start);
                char last = str.charAt(end);
                
                if(!Character.isLetterOrDigit(firtst) && !Character.isLetterOrDigit(last)) {
                    if(Character.toLowerCase(firtst) != Character.toLowerCase(last)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(palind(s));
    }
}
