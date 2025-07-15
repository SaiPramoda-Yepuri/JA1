package ex_32_Collection_Framework.LIST;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AL_LL {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList(); // // Arrays Format - Continuous

        List mylist2 = new LinkedList(); // Doubly Linked List.

        mylist2.add("Pramoda");
        mylist2.add("YS");
        mylist2.add("Hn");
        mylist2.add("Ni");
        mylist2.add("Vi");
        mylist2.add("cc");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add(123);
        System.out.println(mylist2);

        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("Ys"));
        System.out.println(mylist2.indexOf("YS"));
        System.out.println(mylist2.get(0));

        System.out.println(" --- ");

        Iterator iterator =  mylist2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
