package ex_32_Collection_Framework.LIST.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Q_LinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.add(6);
        queue.add(1);
        queue.add(8);
        System.out.println(queue);
        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}
