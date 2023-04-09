public class DUBB {
    public static void removeDublicate(String str ,int indx ,StringBuilder newStr , boolean map[]) {
        if(indx == str.length()) {
            System.out.println(newStr);
            return;
        }

        int currChar = str.charAt(indx);
        if(map[currChar - 'a'] == true) {
            removeDublicate(str, indx+1, newStr, map);
        }else {
            map[currChar - 'a'] = true;
            removeDublicate(str, indx+1, newStr.append(currChar), map);
        }
    } 
    public static void main(String[] args) {
        String str = "AnjeelChaudhary";
        removeDublicate(str, 0, new StringBuilder(),new boolean[10]);
    }
}
