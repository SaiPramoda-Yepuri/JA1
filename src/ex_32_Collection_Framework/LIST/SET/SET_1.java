package ex_32_Collection_Framework.LIST.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SET_1 {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts  = new TreeSet();


        hs.add("Pramoda");
        hs.add("prm");
        hs.add("Ys");
        System.out.println(hs);




    }
}
