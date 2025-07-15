package Queue;

import java.util.ArrayDeque;

public class Array_Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> deck = new ArrayDeque();
        deck.push(15);
        deck.push(10);
     //   deck.pop();
        System.out.println(deck);
    }
}
