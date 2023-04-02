//Adding elements in Queue using LinkedList

import java.util.*;
import java.util.LinkedList;

public class PracticeQuesOne {

        public static void main(String[] args) {
        //Queue is implemented in java only eigther linklist or with dequeue
        Queue q = new LinkedList<>(); 
        q.add(0);
        q.add(1);
        q.add(2);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

        System.out.println("XXXXXXXXXXXXXXXXXXXXX");

        Queue qu = new ArrayDeque<>();
        qu.add(0);
        qu.add(1);
        qu.add(2);
        while(!qu.isEmpty()) {
            System.out.println(qu.peek());
            qu.remove();
        }
    }
}
