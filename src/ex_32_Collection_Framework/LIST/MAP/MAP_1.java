package ex_32_Collection_Framework.LIST.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MAP_1 {
    public static void main(String[] args) {
//        Map m1 = new Map();
        Map m1 = new HashMap(20);
        // Map is key and value pair
        // name -> pramoda
        m1.put("name","pramoda");
        m1.put("rollno",1);
        m1.put("phone",955555555);
//        m1.put(34,90);
        System.out.println(m1);



        Map m2 = new LinkedHashMap();
        m2.put("name","pramoda");
        m2.put("rollno",1);
        m2.put("phone",955555555);
        System.out.println(m2);


        Map m3 = new TreeMap();
        m3.put("firstname","pramoda");
        m3.put("lastname","ys");
        m3.put("rollno",1);
        m3.put("phone",955555555);
        System.out.println(m3);




    }
}
