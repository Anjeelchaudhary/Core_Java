public class DesiredPrintingLetr {
    //This function is replaced by a single code in java ie : subString
    /* 
    public static String PrintLetters(String str,int si,int ei) {
        String subSrting = "";
        for(int i=si;i<ei;i++) {
            subSrting += str.charAt(i);
        }
        return subSrting;
    }*/
    public static void main(String[] args) {
        String str = "HelloWorl";
        //System.out.println(PrintLetters(str,0,5));
        System.out.println(str.substring(0,5));//only this single line can also work ,In java this feature is available
    }
}
