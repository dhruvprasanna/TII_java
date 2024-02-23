package ds;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        for (int i : ll) {
            System.out.println(i);
        }
    }
}