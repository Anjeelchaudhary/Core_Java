package String;

public class BuilderString {
     public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("TomAndJerry");
        System.out.println(sb);

        //this charAt() helps to give only pointed letter 
        System.out.println(sb.charAt(0));

        //to change the letter
        //sb.setCharAt(index, ch);<-syntax
        sb.setCharAt(0, 'B');
        System.out.println(sb);//in upper line it has changed the value so thats why sb is uesed here
    }
}
