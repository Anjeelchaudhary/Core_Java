public class DesiredPrintingLetr {
    public static String PrintLetters(String str,int si,int ei) {
        String subSrting = "";
        for(int i=si;i<ei;i++) {
            subSrting += str.charAt(i);
        }
        return subSrting;
    }
    public static void main(String[] args) {
        String str = "HelloWorl";
        System.out.println(PrintLetters(str,0,5));
    }
}
