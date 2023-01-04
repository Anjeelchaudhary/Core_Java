public class SubSet {
    public static void findSubSet(String str ,String ans ,int i) {
        //base case
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            }else {
                System.out.println(ans);
            }
            return;
        }
        //logic
        findSubSet(str, ans+str.charAt(i), i+1);//if yes condition
        findSubSet(str, ans, i+1);//if no condition
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubSet(str, "", 0);
    }
}
