package LinkedList;
import java.util.*;

class Syntax{
     public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("AnySyntax");
        list.addFirst(" ");
        list.addLast(" ");//adds in last position
        list.remove("");//removes in last position
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}