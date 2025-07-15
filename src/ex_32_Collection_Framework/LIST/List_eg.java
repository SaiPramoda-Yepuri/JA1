package ex_32_Collection_Framework.LIST;

import java.util.ArrayList;

public class List_eg {
    public static void main(String[] args) {
//        List l = new ArrayList(); // Dynamic Diapatch
        ArrayList l = new ArrayList(); // Dynamic Diapatch
        l.add("hello");
        l.add(123);
        l.add(true);
        l.add("Blah Blah");
        System.out.println(l);
    }
}
