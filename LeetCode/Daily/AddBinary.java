package Daily;

public class AddBinary {
    public static void main(String[] args) {
        StringBuffer sf = new StringBuffer();
        String a = "1010";
        String b = "1011";
        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        while(i>=0 || j>=0) {
            int sum = carry;
            if(i>=0) {
                sum += a.charAt(i)-'0';       // a.charAt(i)-'0' <-- this means conveting string into integer
                i--;
            }
            if(j>=0) {
                sum+= b.charAt(j)-'0';       // b.charAt(j)-'0' <-- this means conveting string into integer
                j--;
            }
            carry = sum>=2 ? 1 : 0;          // boolean ? true : false ;
            sf.append(sum%2);
        }
        //for lastCase at last position where a=1;b=1;carry=1
        if(carry!=0) {
            sf.append(carry);
        }
        //here all the number are written in reverse order so we reversed and at line 14 & 18 we converted into integer
        //so we have to again convert it into string form so .toString() is used
        System.out.println(sf.reverse().toString());
    }
}
