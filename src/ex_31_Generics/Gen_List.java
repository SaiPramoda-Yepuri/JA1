package ex_31_Generics;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Gen_List {
    public static void main(String[] args) {
        List normalList = new ArrayList();
        normalList.add(10);
        normalList.add("Pramoda");
        normalList.add(true);

        List<Integer> integerList = new ArrayList();
        integerList.add(10);
        // integerList.add("Pramoda");
    }
}
// List - Collection Framework ->collection of items -> 12,3, pramoda, ys.