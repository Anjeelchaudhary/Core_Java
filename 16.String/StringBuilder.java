public class StringBuilder {
    public StringBuilder() {
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(char ch='a';ch<'z';ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }

    public StringBuilder append(String string) {
        return null;
    }
}